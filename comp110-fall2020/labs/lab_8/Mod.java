import java.util.Scanner;

public class Mod {
    // TODO - write your code below this comment.
    // You need to write a method that will allow this
    // to compile and return the correct result when run.
    //
    // The method you need to write is called in main.
    // As a hint, try to figure out what method specification
    // you'll need in order to make this compile.  You will
    // need to use the modulus (%) operator to get the first
    // value modulus the second value.

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int first = input.nextInt();
        System.out.print("Enter a second integer: ");
        int second = input.nextInt();
        System.out.println("Result: " + modBoth(first, second));
    }
}
