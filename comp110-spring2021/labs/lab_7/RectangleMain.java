public class RectangleMain {
    public static void addSomethingToWidthHeight(int something, Rectangle r) {
        // TODO - write your code below this comment.
        // You need to add `something` to both the width and the height
        // of the given rectangle r.  As a hint, you'll need to use
        // the "getters" and "setters" on r.
    }
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 6);

        System.out.println("BEFORE:");
        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);

        addSomethingToWidthHeight(5, r1);
        addSomethingToWidthHeight(4, r2);

        System.out.println("\nAFTER:");
        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);
    }
}
