import java.util.Scanner;

public class MonthsOnAndAfter {
    // You will need to write a method that makes this
    // code compile and produce the correct output.
    // YOU MUST USE switch!
    // As a hint, you should not have to use the name of each
    // month more than once.
    // TODO - write your code below this comment.

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (0-11): ");
        int month = input.nextInt();
        printMonthsOnAndAfter(month);
    }
}
