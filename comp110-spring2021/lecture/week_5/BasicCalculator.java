import java.util.Scanner;

public class BasicCalculator {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Insert the first integer number: ");
      int num1 = input.nextInt();
      System.out.print("Insert the second integer number: ");
      int num2 = input.nextInt();
      
      int addRes = num1 + num2;
      int subRes = num1 - num2;
      int mulRes = num1 * num2;
      double divRes = (double) num1 / num2;
      
      System.out.println("The addition is: " + addRes);
      System.out.println("The substraction is: " + subRes);
      System.out.println("The multiplication is: " + mulRes);
      System.out.println("The division is: " + divRes); 

   }
}