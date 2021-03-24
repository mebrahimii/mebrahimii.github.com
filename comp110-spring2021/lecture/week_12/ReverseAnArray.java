public class ReverseAnArray {
   
   
   // reverse an int array
   public static int[] reverseArray(int[] arr) {
      int[] myrevArray = new int[arr.length]; 
      // add your code here
      for (int index = 0; index < arr.length; index++) {
         myrevArray[index] = arr[(arr.length -1) - index];
      }
      
      return myrevArray;
   }
   
   // print an int array
   public static void printArray(int[] arr) {
      for(int element : arr) {
         System.out.print(element + " ");
      }
   }
   
   // main method
   public static void main(String[] args) {
      int[] myArray = new int[]{1, 4, 5, 7, 8};
      System.out.print("The input array is: ");
      printArray(myArray);
      int[] myReverseArray = reverseArray(myArray);
      System.out.println();
      System.out.print("The reverse array is: ");
      printArray(myReverseArray);
      
   }

}