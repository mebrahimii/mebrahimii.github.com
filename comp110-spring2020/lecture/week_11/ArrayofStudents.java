public class ArrayofStudents {
   
   public static void main(String[] args) {
      Student[] myStudentList = new Student[2];
      
      // first element
      myStudentList[0] = new Student(111, "John Omeara");
            
      // second element
      myStudentList[1] = new Student(112, "Mary Nelson");
      
      for (int index = 0; index < myStudentList.length; index++) {
         System.out.println("The studentID: " + myStudentList[index].getStudentID() + 
         ", the student name: " + myStudentList[index].getstudentName());      
      }
      
      // Or
      // for (Student myStudent: myStudentList) {
      //    System.out.println("The studentID: " + myStudent.getStudentID() + 
      //   ", the student name: " + myStudent.getstudentName());      
      // }   
   }
}