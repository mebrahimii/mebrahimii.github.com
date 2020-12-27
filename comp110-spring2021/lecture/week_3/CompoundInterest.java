import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle (long): ");
        long p = in.nextLong();
        System.out.print("Enter annual interest rate (double): ");
        double r = in.nextDouble();
        System.out.print("Enter number of times interest is compounded per year (int): ");
        int n = in.nextInt();
        System.out.print("Enter number of years invested (int): ");
        int t = in.nextInt();
        double a = p * Math.pow(1 + r / n, n * t);
        System.out.println("Compound interest including principal: " + a);
    }
}