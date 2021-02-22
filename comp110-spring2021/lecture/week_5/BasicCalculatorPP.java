import java.util.Scanner;

public class BasicCalculatorPP {

   public static int addition(int n1, int n2) {
      return n1 + n2;
   }

   public static int substraction(int n1, int n2) {
      return n1 - n2;
   }

   public static int multiplication(int n1, int n2) {
      return n1 * n2;
   }

   public static double division(int n1, int n2) {
      return (double) n1 / n2;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Insert the first integer number: ");
      int num1 = input.nextInt();
      System.out.print("Insert the second integer number: ");
      int num2 = input.nextInt();
      
      int addRes = addition(num1, num2);
      int subRes = substraction(num1, num2);
      int mulRes = multiplication(num1, num2);
      double divRes = division(num1, num2);
      
      System.out.println("The addition is: " + addRes);
      System.out.println("The substraction is: " + subRes);
      System.out.println("The multiplication is: " + mulRes);
      System.out.println("The division is: " + divRes); 

   }
}