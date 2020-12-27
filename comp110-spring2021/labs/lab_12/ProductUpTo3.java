import java.util.Scanner;

public class ProductUpTo3 {
    // TODO - write your code below this comment.
    // You will need to write a method that will take
    // an array of int, and will return the product of
    // the first three elements.  NOTE THAT
    // THE ARRAY LENGTH MAY BE SMALLER THAN 3.
    // In the event that the array isn't long enough,
    // substitute 1s for the missing elements.
    // For example:
    // - if the array is empty you should return 1 (1 * 1 * 1 = 1),
    // - if the array contains only one element, you should
    //   return that element (element * 1 * 1 = element)
    // - if the array contains only two elements, you
    //   should return the product of those two elements
    //   (first * second * 1 = first * second)
    // - if the array contains three or more elements,
    //   you should return the product of the first three.
    //
    // You may be given an array which holds more than
    // three elements.  These extra elements (beyond three)
    // should be ignored.
    //
    // As a hint, switch may be useful here (though you
    // are not required to use it).
    //

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Enter first integer: ");
        array[0] = input.nextInt();
        System.out.print("Enter second integer: ");
        array[1] = input.nextInt();
        System.out.print("Enter third integer: ");
        array[2] = input.nextInt();
        System.out.println("Product: " + productUpToFirst3(array));
    }
}
