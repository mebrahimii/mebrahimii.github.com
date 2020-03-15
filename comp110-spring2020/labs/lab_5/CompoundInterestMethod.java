import java.util.Scanner;

public class CompoundInterestMethod {
    // TODO - write your code below this comment.
    // You need to write a method that will allow this
    // to compile and return the correct result when run.
    //
    // The method you need to write is called in main.
    // As a hint, try to figure out what method specification
    // you'll need in order to make this compile.
    // The code you write will reuse code you wrote in lab 3.
    
    // DO NOT MODIFY main!
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
        double a = compoundInterest(p, r, n, t);
        System.out.println("Compound interest including principal: " + a);
    }
}
