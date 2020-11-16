public class Subtract extends ArithmeticOperation {
    public Subtract(int x, int y) {
        super(x, y);
    }

    public int doOperation() {
        return getLeft() - getRight();
    }
}
