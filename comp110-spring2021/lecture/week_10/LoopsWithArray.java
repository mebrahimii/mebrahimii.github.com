public class LoopsWithArray {

   public static int addition(int[] myArray) {
      int sum = 0;
      for (int idx = 0; idx < myArray.length; idx++) {
          sum = sum + myArray[idx];
      }
      return sum;   
   }
   
   public static int multiplication(int[] myArray) {
      int res = 1;
      for (int idx = 0; idx < myArray.length; idx++) {
          res *= myArray[idx];
      }
      return res;   
   }
   
   public static void ArrayAdd5(int[] myArray) {
      for (int idx = 0; idx < myArray.length; idx++) {
          myArray[idx] += 5;
      }
   }


   public static void main(String[] args) {
     
     int[] numbers = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 22};
     int sum = addition(numbers);
     System.out.println("The sum of the numbers is: " + sum);
     
     int prod = multiplication(numbers); 
     System.out.println("The multiplication of the numbers is: " + prod);
     
     
     ArrayAdd5(numbers);
     for (int i = 0; i < numbers.length; i++) {
         System.out.println("The element in index " + i + " is: " + numbers[i]);
     }
   
   }


}