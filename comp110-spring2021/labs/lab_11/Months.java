import java.util.Scanner;

public class Months {
    // You will need to write a method that makes this
    // code compile and produce the correct output.
    // YOU MUST USE switch!
    // TODO - write your code below this comment.

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (0-11): ");
        int month = input.nextInt();
        String output = monthAsString(month);
        System.out.println(output);
    }
}
