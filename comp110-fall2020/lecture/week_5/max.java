import java.util.Scanner;

public class max
{
   public static double calMax(double num1, double num2)
   {
      if (num1 > num2)
      {
         return num1;
      } 
      else
      {
         return num2;
      }
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Insert the first number:");
      double first = in.nextDouble();
      System.out.print("Insert the second number:");
      double second = in.nextDouble();
      
      double myMax = calMax(first, second);
      System.out.println("The max number is: " + myMax);          
  
   }
}