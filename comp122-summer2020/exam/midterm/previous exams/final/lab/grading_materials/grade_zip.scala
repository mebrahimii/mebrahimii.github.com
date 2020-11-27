// Rubric:
// - find_min_array.s:   65
// - add_amount_array.s: 85

import java.io.File

object SymbolChanger {
  val LabelRegex = """^\s*([^:]+):\s*$""".r
  val ExitRegex = """^\s*[sS][wW][iI]\s+(SWI_Exit|0x11).*$""".r

  type Label = String

  val currentDirectory = new File(".")

  def writeToFile(what: Seq[String], file: File) {
    import java.io.{BufferedWriter, FileWriter}
    val writer = new BufferedWriter(new FileWriter(file))
    what.foreach(line => {
      writer.write(line)
      writer.newLine()
    })
    writer.close()
  }

  
  def withEndValue(input: Seq[String], putThis: Seq[String]): Seq[String] = {
    var valuePlaced = false
    val retval =
      input.flatMap(curLine =>
	curLine match {
	  case ExitRegex(_) => {
	    assert(!valuePlaced)
	    valuePlaced = true
	    putThis ++ Seq(curLine)
	  }
	  case _ => Seq(curLine)
	})
    assert(valuePlaced)
    retval
  }
}
import SymbolChanger.Label

class SymbolChanger(val around: File, val putAtEnd: Option[Seq[String]]) {
  import SymbolChanger._
  private val lines: Array[String] =
    scala.io.Source.fromFile(around).getLines.toArray

  private def withEndValue(input: Seq[String]): Seq[String] = {
    putAtEnd match {
      case Some(putThis) => {
	SymbolChanger.withEndValue(input, putThis)
      }
      case None => input
    }
  }

  private def linesWithSymbols(symbols: Map[Label, String]): Seq[String] = {
    val retval: Array[String] = new Array(lines.length)
    var pos: Int = 0
    while (pos < lines.length) {
      lines(pos) match {
	case LabelRegex(label) if symbols.contains(label) => {
	  retval(pos) = lines(pos)
	  retval(pos + 1) = symbols(label)
	  pos += 2
	}
	case other => {
	  retval(pos) = other
	  pos += 1
	}
      }
    }
    withEndValue(retval)
  }

  def withSymbols[A](symbols: Map[Label, String])(doThis: File => A): A = {
    val edited = linesWithSymbols(symbols)
    val newFile = File.createTempFile("temp", ".s", currentDirectory)
    writeToFile(edited, newFile)
    try {
      doThis(newFile)
    } finally {
      newFile.delete()
    }
  }
}

sealed trait TestResult
case object TestPassed extends TestResult
case object FailedToRun extends TestResult
case class UnexpectedOutput(output: Seq[String]) extends TestResult

object TestOutput {
  def joinMessages(m1: Option[String], m2: Option[String]): Option[String] = {
    (m1, m2) match {
      case (Some(s1), Some(s2)) => Some(s1 + "\n" + s2)
      case (Some(s), None) => Some(s)
      case (None, Some(s)) => Some(s)
      case (None, None) => None
    }
  }
}

case class TestOutput(points: Int, message: Option[String]) {
  def join(other: TestOutput): TestOutput = {
    TestOutput(points + other.points,
	       TestOutput.joinMessages(message, other.message))
  }
}

object Portion {
  def chainPortions(portions: Portion*) {
    portions.foreach(_.doPrintln())
    println(portions.map(_.output.points).sum)
  }
}

case class Portion(name: String, output: TestOutput) {
  def doPrintln() {
    println(name + ": " + output.points)
    output.message match {
      case Some(msg) => {
        println("\t" + msg.replace("\n", "\n\t"))
      }
      case _ => ()
    }
  }
}

object RunArmSim {
  val ARMSIM_LOCATION = "/home/kyle/ARMSim-Windows/Build/ARMSim.exe"

  def tryIsNonzero[A](f: => A): Option[A] = {
    try {
      Some(f)
    } catch {
      case e: RuntimeException if e.getMessage.contains("Nonzero exit value") =>
        None
    }
  }

  // returns the raw output from ArmSim
  // returns None if it couldn't run
  def runArmSim(assemblyFile: String): Option[String] = {
    import scala.sys.process._
    tryIsNonzero(Seq("mono",
		     ARMSIM_LOCATION,
		     "/X:100000",
		     "/Batch",
		     assemblyFile).!!)
  }

  def stripWhitespaceCapitalization(s: Seq[String]): String = {
    stripWhitespaceCapitalization(s.mkString)
  }

  def stripWhitespaceCapitalization(s: String): String = {
    s.toLowerCase.replaceAll("""\s""", "")
  }

  def cleanArmSimOutput(raw: String): String = {
    def junkLine(s: String): Boolean = {
      s.contains("ARMSim#") || s.startsWith("Loading")
    }
    stripWhitespaceCapitalization(raw.split("\n").filterNot(junkLine).toSeq)
  }

  def runArmSimExpect(assemblyFile: String, expected: Seq[String]): TestResult = {
    runArmSim(assemblyFile) match {
      case Some(received) => {
        if (cleanArmSimOutput(received) == stripWhitespaceCapitalization(expected)) {
          TestPassed
        } else {
          UnexpectedOutput(received.split("\n").toSeq)
        }
      }
      case None => FailedToRun
    }
  }

  def runArmSimExpectPoints(assemblyFile: String,
                            expected: Seq[String],
                            outOf: Int): TestOutput = {
    runArmSimExpect(assemblyFile, expected) match {
      case TestPassed => TestOutput(outOf, None)
      case FailedToRun => TestOutput(0, Some("failed to run"))
      case UnexpectedOutput(output) => {
        val message =
          ("Unexpected output.\nReceived:\n" + output.mkString("\n") +
           "\nExpected:\n" + expected.mkString("\n"))
        TestOutput(0, Some(message))
      }
    }
  }
}

abstract class AssemblyComponent[A](val file: File) {
  import RunArmSim.runArmSimExpectPoints
  // ---BEGIN CONSTRUCTOR---
  val changer = new SymbolChanger(file, putAtEnd)
  lazy val output: TestOutput =
    inputs.foldLeft(TestOutput(0, None))((res, cur) => {
      res.join(
	changer.withSymbols(asMap(cur))(file =>
	  runArmSimExpectPoints(file.getPath,
				outputForInput(cur),
				pointsPerInput)))
    })
  // ---END CONSTRUCTOR---

  def this(filename: String) {
    this(new File(filename))
  }

  // ---BEGIN ABSTRACT MEMBERS---
  def inputs(): Seq[A]
  def asMap(a: A): Map[Label, String]
  def outputForInput(input: A): Seq[String]
  // ---END ABSTRACT MEMBERS---

  def putAtEnd(): Option[Seq[String]] = None

  def pointsPerInput(): Int = 1

  def asPortion(): Portion = {
    Portion(file.getName, output)
  }
}

object ListGenerator {
  def gen(minValue: Int, maxValue: Int, maxNumValues: Int): List[List[Int]] = {
    val base = minValue.to(maxValue).toList
    def loop(maxNumValues: Int): List[List[Int]] = {
      if (maxNumValues <= 0) {
	List()
      } else if (maxNumValues == 1) {
	base.map(i => List(i))
      } else {
	val lower= loop(maxNumValues - 1)
	lower ++ (for {
          cur <- base
          rest <- loop(maxNumValues - 1)
	} yield cur :: rest)
      }
    }
    loop(maxNumValues)
  }

  def genDiverse(minValue: Int, maxValue: Int, maxNumValues: Int, takeNum: Int): List[List[Int]] = {
    val base = gen(minValue, maxValue, maxNumValues)
    assert(base.size >= takeNum)
    val portionAmount = takeNum / 2
    val retval = base.take(portionAmount) ++ base.reverse.take(portionAmount)
    val numMissing = takeNum - retval.size
    val finalRetval = retval ++ base.drop(portionAmount).take(numMissing)
    assert(finalRetval.size == takeNum)
    finalRetval
  }

  def genDiverse(takeNum: Int): List[List[Int]] = {
    genDiverse(-3, 3, 4, takeNum)
  }

  def asArray(input: Seq[Int]): String = {
    ".word " + input.mkString(", ")
  }
}

object ZipGrader extends AssemblyComponent[Seq[(Int, Int)]]("zip.s") {
  val inputs: Seq[Seq[(Int, Int)]] =
    ListGenerator.genDiverse(35).map(inner =>
      inner.zip(scala.util.Random.shuffle(inner)).toSeq).toSeq

  override def putAtEnd(): Option[Seq[String]] = {
    Some(
      Seq(";;; -----BEGIN INJECTED CODE-----",
	  ";; r2: pointer to result array",
	  ";; r3: number of elements left to print",
	  "ldr r2, =result_array",
	  "ldr r3, =first_second_length",
	  "ldr r3, [r3]",
	  "mov r3, r3, LSL #1",
	  "",
	  "begin_for_kyledewey:",
	  "cmp r3, #0",
	  "beq end_for_kyledewey",
	  "",
	  "mov r0, #1",
	  "ldr r1, [r2]",
	  "swi SWI_Print_Int",
	  "",
	  "mov r0, #'\n",
	  "swi SWI_Print_Char",
	  "",
	  "add r2, r2, #4",
	  "sub r3, r3, #1",
	  "b begin_for_kyledewey",
	  "end_for_kyledewey:",
	  ";;; -----END INJECTED CODE-----"))
  } // putAtEnd

  def asMap(input: Seq[(Int, Int)]): Map[Label, String] = {
    Map("first_array" -> ListGenerator.asArray(input.map(_._1)),
	"second_array" -> ListGenerator.asArray(input.map(_._2)),
	"result_array" -> ListGenerator.asArray(0.until(input.size * 2).map(_ => -1)),
	"first_second_length" -> ListGenerator.asArray(Seq(input.size)))
  }

  def outputForInput(input: Seq[(Int, Int)]): Seq[String] = {
    input.flatMap( { case (i1, i2) => Seq(i1.toString, i2.toString) } )
  }
} // ZipGrader

object GradeZip {
  def main(args: Array[String]) {
    Portion.chainPortions(ZipGrader.asPortion)
  }
} // GradeZip
