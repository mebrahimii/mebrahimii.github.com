import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base value (double): ");
        double base = in.nextDouble();
        System.out.print("Exponent (double): ");
        double exponent = in.nextDouble();
        double result = Math.pow(base, exponent);        
        System.out.println("Result: " + result);
    }
}
