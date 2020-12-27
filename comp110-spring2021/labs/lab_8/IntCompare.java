import java.util.Scanner;

public class IntCompare {
    // TODO - write your code below this comment.
    // You need to define two static methods, described below:
    //
    // 1.) 
    // - The method's name is firstIsLessThanSecond
    // - The method's return type is boolean
    // - The method's first parameter is an int
    // - The method's second parameter is an int
    // - The method returns true if the first int is less than
    //   the second, else false.
    //
    // 2.)
    // - The method's name is firstIsGreaterThanSecond
    // - The method's return type is boolean
    // - The method's first parameter is an int
    // - The method's second parameter is an int
    // - The method returns true if the first int is greater than
    //   the second, else false.
    

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();
        System.out.println("Less than: " + firstIsLessThanSecond(first, second));
        System.out.println("Greater than: " + firstIsGreaterThanSecond(first, second));
    }
}
