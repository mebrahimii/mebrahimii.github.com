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
		     "/X:10000",
		     "/Batch",
		     "/P:0x00001060:0x00001088/D4",
		     assemblyFile).!!)
  }

  def stripWhitespaceCapitalization(s: Seq[String]): String = {
    stripWhitespaceCapitalization(s.mkString)
  }

  def stripWhitespaceCapitalization(s: String): String = {
    s.toLowerCase.replaceAll("""\s""", "")
  }

  def cleanArmSimOutput(raw: String): Either[Seq[String], Seq[Int]] = {
    val lines = raw.split("\n").toSeq
    val pos = lines.indexWhere(_.startsWith("Contents of memory:"))
    if (pos != -1) {
      val intPortions = lines.drop(pos + 1).filter(_.startsWith("00")).flatMap(_.split(":").apply(1).trim.split("""\s+"""))
      Right(intPortions.map(_.toInt))
    } else {
      Left(lines)
    }
  }

  def runArmSimExpect(assemblyFile: String, expected: Seq[Int]): TestResult = {
    runArmSim(assemblyFile) match {
      case Some(received) => {
	cleanArmSimOutput(received) match {
	  case Right(`expected`) => TestPassed
	  case Right(other) => UnexpectedOutput(other.map(_.toString))
	  case Left(other) => UnexpectedOutput(other)
	}
      }
      case None => FailedToRun
    }
  }

  def runArmSimExpectPoints(assemblyFile: String,
                            expected: Seq[Int],
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

  def withInputFile[A](inputFilename: String, contents: Seq[String])(doThis: => A): A = {
    import java.io.{File, FileWriter, BufferedWriter}
    val outputFilename = new File(inputFilename)
    val output = new BufferedWriter(new FileWriter(outputFilename))
    contents.foreach(line => {
      output.write(line)
      output.newLine()
    })
    output.close()
    val retval = doThis
    outputFilename.delete()
    retval
  }
}

object GradeFib {
  val filename = "fib.s"
  lazy val asPortion =
    Portion(
      filename,
      RunArmSim.runArmSimExpectPoints(
        filename,
        Seq(0, 1, 1, 2, 3, 5, 8, 13, 21, 34),
        50))

  def main(args: Array[String]) {
    Portion.chainPortions(asPortion)
  }
}

