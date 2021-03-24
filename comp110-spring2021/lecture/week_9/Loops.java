import java.util.Scanner;
public class Loops {
 // get 5 numbers from user and calculate the summation
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = 5, sum = 0, num;
   for (int i = 1; i <= n; i++) {   // i = i + 1; 
      System.out.print("Insert the number " + i + " : ");
      num = in.nextInt();
      sum += num;  // sum = sum + num;
   }
   System.out.print("The summation is : " + sum);
 }
}