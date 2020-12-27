import java.util.Scanner;

public class IsGreaterThan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int myInt = input.nextInt();

        if (myInt > 5) {
            System.out.println("It's greater than 5!");
        } else {
            System.out.println("It's not greater than 5...");
        }
    }
}
