import java.util.Scanner;

public class MinMax {
    // You need to write two methods: min and max.
    // min should take two ints and return the smaller one,
    // and max should take two ints and return the larger one.
    // If the two ints given are the same, then they can return
    // either one.
    //
    // As a hint, you will need to use if/else, along with
    // a comparison of some sort between the two given ints.
    // DO NOT CALL Math.min OR Math.max!
    // TODO - write your code below this comment.

    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();
        System.out.println("Min: " + min(first, second));
        System.out.println("Max: " + max(first, second));
    }
}
