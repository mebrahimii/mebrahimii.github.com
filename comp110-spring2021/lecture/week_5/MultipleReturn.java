import java.util.Scanner;

public class MultipleReturn {
    public static int absoluteValue(int input) {
        if (input < 0) {
            return -input;
        } else {
            return input;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int myInt = input.nextInt();
        System.out.println("Absolute value: " + absoluteValue(myInt));
    }
}
