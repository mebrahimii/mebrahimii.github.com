// This code will NOT compile
public class PrivateClassMain {
    public static void main(String[] args) {
        // CANNOT use this constructor because it's private
        PrivateClass pc = new PrivateClass(5);

        // CANNOT access the instance variable i directly
        // because it's private
        System.out.println(pc.i);

        // CANNOT call the printI method because it's private
        pc.printI();
    }
}
