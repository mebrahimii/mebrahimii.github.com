import java.util.Scanner;

public class Comparisons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int first = input.nextInt();
        System.out.print("Enter a second integer: ");
        int second = input.nextInt();
        boolean greaterThan = first > second;
        boolean lessThan = first < second;
        boolean lessThanOrEquals = first <= second;
        boolean greaterThanOrEquals = first >= second;
        boolean equals = first == second;
        boolean notEquals = first != second;
        System.out.println("Greater than: " + greaterThan);
        System.out.println("Less than: " + lessThan);
        System.out.println("Less than or equals: " + lessThanOrEquals);
        System.out.println("Greater than or equals: " + greaterThanOrEquals);
        System.out.println("Equals: " + equals);
        System.out.println("Not equals: " + notEquals);
    }
}
