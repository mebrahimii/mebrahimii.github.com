public class ReturnNothing {
    // doesn't return anything
    public static void printStuff() {
        System.out.println("Some stuff");
        System.out.println("Some more stuff");
    }
    
    // doesn't return anything
    // takes an integer and binds it to the variable `x`
    public static void printParameter(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        printStuff();
        printParameter(777);
        printStuff();
    }
}
