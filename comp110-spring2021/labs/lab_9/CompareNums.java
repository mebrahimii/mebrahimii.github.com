import java.util.Scanner;

public class CompareNums {
    // The method you define will return one of three possible strings:
    // - "less than": if the first parameter is less than the second
    // - "equal to": if the first parameter is equal to the second
    // - "greater than": if the first parameter is greater than the second
    // Make sure you return _exactly_ the above strings
    // TODO - write your code below this comment.
   
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();
        System.out.println("The first integer is " +
                           comparison(first, second) +
                           " the second integer.");
    }
}
