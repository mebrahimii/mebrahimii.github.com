import java.util.Scanner;

public class InRange {
    private int min;
    private int max;

    public InRange(int initialMin, int initialMax) {
        min = initialMin;
        max = initialMax;
    }

    // You need to write two instance methods:
    // 1.) A method named inRange, which takes an int.
    //     This returns true if the int is within the given range
    //     (inclusive), else false.
    //
    // 2.) A method named outOfRange which takes an int.
    //     This returns false if the int is within the given range
    //     (inclusive), else true.  This method calls inRange.
    //
    // outOfRange always does the exact opposite of inRange.
    // FOR FULL CREDIT, outOfRange MUST CALL inRange and negate the result!
    //
    // TODO - write your code below this comment.
    
    
    // Do not Modify main()
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Low end of range: ");
        int min = input.nextInt();
        System.out.print("High end of range: ");
        int max = input.nextInt();
        System.out.print("Number: ");
        int num = input.nextInt();
        InRange range = new InRange(min, max);
        
        System.out.println("In range: " + range.inRange(num));
        System.out.println("Out of range: " + range.outOfRange(num));
    }
}
