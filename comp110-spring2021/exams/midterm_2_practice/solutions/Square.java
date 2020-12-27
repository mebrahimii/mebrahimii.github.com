public class Square {
    private int sideLength;

    public Square(int initialSideLength) {
        sideLength = initialSideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int newSideLength) {
        sideLength = newSideLength;
    }

    public int getArea() {
        return sideLength * sideLength;
    }
    
    public static void printSquare(Square s) {
        System.out.println("Side length: " + s.getSideLength());
        System.out.println("Area: " + s.getArea());
    }
    
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("With an initial side length of 5:");
        printSquare(s);
        s.setSideLength(10);
        System.out.println("After setting side length to 10:");
        printSquare(s);
    }
}
