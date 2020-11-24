public class CatchException {
    public static void main(String[] args) {
        try {
            System.out.println("Before call");
            ThrowMyException.throwIfGreaterThan5(42);
            System.out.println("After call");
        } catch (MyException e) {
            System.out.println(e.toString());
        }
        System.out.println("After try");
    }
}
