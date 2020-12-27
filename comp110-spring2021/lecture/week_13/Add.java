public class Add extends ArithmeticOperation {
    public Add(int x, int y) {
        super(x, y);
    }

    public int doOperation() {
        return getLeft() + getRight();
    }
}
