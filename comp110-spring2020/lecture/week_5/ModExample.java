import java.util.Scanner;

public class ModExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int first = input.nextInt();
        System.out.print("Enter a second integer: ");
        int second = input.nextInt();
        System.out.println("Result: " + (first % second));
    }
}
