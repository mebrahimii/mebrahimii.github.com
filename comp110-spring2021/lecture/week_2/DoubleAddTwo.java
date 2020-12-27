import java.util.Scanner;

public class DoubleAddTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first double: ");
        double first = in.nextDouble();
        System.out.print("Enter second double: ");
        double second = in.nextDouble();
        double added = first + second;
        System.out.print("Sum: ");
        System.out.println(added);
    }
}
