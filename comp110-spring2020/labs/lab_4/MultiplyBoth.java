import java.util.Scanner;

public class MultiplyBoth {
    public static int multiplyBoth(int first, int second) {
        // The code you write should multiply the two
        // given parameters together and return the result.
        // TODO - write your code below this comment.
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int first = input.nextInt();
        System.out.print("Enter a second integer: ");
        int second = input.nextInt();
        System.out.println("Result: " + multiplyBoth(first, second));
    }
}
