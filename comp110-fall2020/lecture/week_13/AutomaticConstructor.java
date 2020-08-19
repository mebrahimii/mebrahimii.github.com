public class AutomaticConstructor {
    // Because we do not define any explicit
    // constructors, Java automatically
    // defines the following constructor:
    //
    // public AutomaticConstructor() {}
    //
    
    public void printSomething() {
        System.out.println("Something");
    }

    public static void main(String[] args) {
        // can still make an instance of AutomaticConstructor
        AutomaticConstructor a = new AutomaticConstructor();

        // can still call methods on instances of
        // AutomaticConstructor
        a.printSomething();
    }
}
