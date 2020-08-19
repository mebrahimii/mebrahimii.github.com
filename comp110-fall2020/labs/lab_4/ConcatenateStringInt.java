import java.util.Scanner;

public class ConcatenateStringInt {
    // You need to define a method with the following properties:
    // - The method's name is concatenate
    // - The method's return type is String
    // - The method's first parameter is a String
    // - The method's second parameter is an int
    // - The method concatenates the String and the int, in that
    //   order.  For example, concatenate("foo", 5) should return
    //   foo5
    // TODO - write your code below this comment.

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String myString = input.nextLine();
        System.out.print("Enter integer: ");
        int myInteger = input.nextInt();
        System.out.println("Concatenated: " +
                           concatenate(myString, myInteger));
    }
}
