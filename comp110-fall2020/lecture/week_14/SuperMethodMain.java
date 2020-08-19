public class SuperMethodMain {
    public static void main(String[] args) {
        Base base = new Base();
        Sub sub = new Sub();

        System.out.println("Base num: " + base.returnNum());
        System.out.println("Sub num: " + sub.returnNum());
    }
}
