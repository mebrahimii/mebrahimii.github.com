import java.util.Scanner;

public class MultiplySeven {
    public static int multiplyBy7(int parameter) {
        // TODO - write your code below this comment.
        // The code you write should multiply parameter
        // by seven, returning the result.
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        System.out.println("Multiplied by 7: " + multiplyBy7(i));
    }
}
