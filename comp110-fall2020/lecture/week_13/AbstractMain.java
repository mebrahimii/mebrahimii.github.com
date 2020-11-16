public class AbstractMain {
    public static void main(String[] args) {
        // Will not compile with this line uncommented,
        // since AbstractBase is an abstract class:
        //
        // AbstractBase base = new AbstractBase(5);

        // This is ok, since AbstractSub is not an
        // abstract class, even though AbstractSub
        // inherits from AbstractBase
        AbstractSub sub = new AbstractSub(6);
    }
}
