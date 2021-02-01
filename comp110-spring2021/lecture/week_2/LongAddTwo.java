import java.util.Scanner;

public class LongAddTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first long: ");
        long first = in.nextLong();
        System.out.print("Enter second long: ");
        long second = in.nextLong();
        long added = first + second;
        System.out.print("Sum: ");
        System.out.println(added);
    }
}
