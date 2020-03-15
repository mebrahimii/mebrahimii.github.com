public class PrivateClass {
    private int i; // instance variable

    private PrivateClass(int x) {
        i = x;
    }

    private void printI() {
        System.out.println(i);
    }
}
