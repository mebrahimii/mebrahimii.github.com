public class Square {
    // Components required:
    // 1.) An instance variable which stores the length of a side.
    //     This instance variable should only be internally accessible.
    //
    // 2.) A constuctor which will initialize this instance variable to
    //     an initial value.
    //
    // 3.) Getters and setters for this instance variable.
    //
    // 4.) A getArea method, that returns the area of a square.  If
    //     the square length is s, then the area of the square is s to
    //     the second power.
    //
    // TODO - write your code below this comment.
    //

    // DO NOT MODIFY printSquare!
    public static void printSquare(Square s) {
        System.out.println("Side length: " + s.getSideLength());
        System.out.println("Area: " + s.getArea());
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("With an initial side length of 5:");
        printSquare(s);
        s.setSideLength(10);
        System.out.println("After setting side length to 10:");
        printSquare(s);
    }
}
