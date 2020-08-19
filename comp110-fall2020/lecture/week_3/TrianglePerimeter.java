import java.util.Scanner;

public class TrianglePerimeter {
    public static int perimeter(int a, int b, int c) {
        return a + b - c;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Side A length: ");
        int a = input.nextInt();
        System.out.print("Side B length: ");
        int b = input.nextInt();
        System.out.print("Side C length: ");
        int c = input.nextInt();
        System.out.println("Triangle perimeter: " + perimeter(a, b, c));
    }
}
