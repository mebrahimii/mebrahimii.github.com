public class MultParameters3 {
    // returns a double
    // takes a long and a double, and binds their values to
    // the variables `myLong` and `myDouble`
    public static double multParameters3(long myLong, double myDouble) {
        return myLong * myDouble;
    }

    public static void main(String[] args) {
        System.out.println(multParameters3(3, 2.5));   // prints 7.5
        System.out.println(multParameters3(4, 2.25));  // prints 9.0
        System.out.println(multParameters3(5, 0.5));   // prints 2.5
    }
}
