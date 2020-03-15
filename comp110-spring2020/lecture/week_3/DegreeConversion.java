import java.util.Scanner;

public class DegreeConversion {
   
   public static double calF() {
         double f = num * 1.8 + 32;
         return f;
   }
   
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter temperature in Celsius: ");
        //double d = in.nextDouble();
        double result = calF(14.5);
        System.out.println("Fahrenheit: " + result);
    }
}