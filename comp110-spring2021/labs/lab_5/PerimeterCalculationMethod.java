import java.util.Scanner;

public class PerimeterCalculationMethod {
    // You need to define a method with the following properties:
    // - The method's name is calculatePerimeter
    // - The method's return type is int
    // - The method's first parameter is an int
    // - The method's second parameter is an int
    // - The method calculates the perimeter, as you did in lab 2
    // TODO - write your code below this comment.
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = in.nextInt();
        System.out.print("Enter height: ");
        int height = in.nextInt();
        int perimeter = calculatePerimeter(width, height);
        System.out.println("Perimeter: " + perimeter);
    }
}
