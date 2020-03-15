import java.util.Scanner;

public class SwitchBreak {
    public static void fallthroughExampleWithBreak(int input) {
        switch (input) {
        case 1:
            System.out.println("First case");
            break; // Added line from SwitchFallthrough
        case 2:
            System.out.println("Second case");
            break; // Added line from SwitchFallthrough
        case 3:
            System.out.println("Third case");
        default:
            System.out.println("Default case");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int entered = input.nextInt();
        fallthroughExampleWithBreak(entered);
    }
}
