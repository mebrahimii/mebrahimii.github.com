import java.util.Scanner;

public class BasicCalculatorOO {

   int number1;
   int number2;

   public BasicCalculatorOO(int n1, int n2) {
      number1 = n1;
      number2 = n2;
   }

   public int addition() {
      return number1 + number2;
   }

   public int substraction() {
      return number1 - number2;
   }

   public int multiplication() {
      return number1 * number2;
   }

   public int division() {
      return number1 / number2;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Insert the first integer number: ");
      int num1 = input.nextInt();
      System.out.print("Insert the second integer number: ");
      int num2 = input.nextInt();
      
      BasicCalculator bc = new BasicCalculator(num1, num2);
      int addRes = bc.addition();
      int subRes = bc.substraction();
      int mulRes = bc.multiplication();
      double divRes = bc.division();
      
      System.out.println("The addition is: " + addRes);
      System.out.println("The substraction is: " + subRes);
      System.out.println("The multiplication is: " + mulRes);
      System.out.println("The division is: " + divRes); 

   }
}