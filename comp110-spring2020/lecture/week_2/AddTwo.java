import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = in.nextInt();
        System.out.print("Enter second integer: ");
        int second = in.nextInt();
        int added = first + second;
        System.out.print("Sum: " + added);
    }
}
