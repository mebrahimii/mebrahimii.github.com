public class OverrideMain {
    public static void main(String[] args) {
        OverrideBase base = new OverrideBase();
        OverrideBase sub = new OverrideSub();

        System.out.println("BASE: " + base.someMethod());
        System.out.println("SUB: " + sub.someMethod());
    }
}
