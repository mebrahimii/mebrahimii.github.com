public abstract class ArithmeticOperation {
    private int left;
    private int right;

    public ArithmeticOperation(int x, int y) {
        left = x;
        right = y;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
    
    public abstract int doOperation();

    public static void main(String[] args) {
        Add add = new Add(2, 3);
        Subtract sub = new Subtract(10, 4);

        System.out.println("Add: " + add.doOperation());
        System.out.println("Subtract: " + sub.doOperation());
    }
}
