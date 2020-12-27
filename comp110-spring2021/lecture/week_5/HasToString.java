public class HasToString {
    private String held;

    public HasToString(String s) {
        held = s;
    }

    public String toString() {
        return held;
    }

    public static void main(String[] args) {
        HasToString s = new HasToString("hello");
        System.out.println(s);
    }
}
