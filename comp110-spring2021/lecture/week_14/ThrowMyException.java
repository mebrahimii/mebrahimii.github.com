public class ThrowMyException {
    public static void throwIfGreaterThan5(int num) throws MyException {
        if (num > 5) {
            throw new MyException("Is greater than 5: " + num);
        } else {
            System.out.println("OK: " + num);
        }
    }

    public static void main(String[] args) throws MyException {
        throwIfGreaterThan5(2);
        throwIfGreaterThan5(42);
    }
}
