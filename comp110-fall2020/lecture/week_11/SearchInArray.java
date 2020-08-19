public class SearchInArray {

   public static int searchArray(int[] arr, int num) {
      // add your code here
      int count = 0;
      for (int element: arr) {   
         if (element == num) {  
            count++; // count = count + 1 or count +=1
         }
      }      
      return count;
   }
   
   
   public static void main(String[] args) {
      int[] myArr = new int[]{1, 4, 5, 7, 8, 1, 5, 1, 4}; 
      int myNum = 9;
      int mynumCount = searchArray(myArr, myNum);       
      System.out.println("The count of " + myNum + " in the input array is: " + mynumCount);
   
   }

}