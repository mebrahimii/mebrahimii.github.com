public class ReturnParameter {
    // returns an integer
    // takes an integer parameter, and binds its value
    // to the variable `parameter`
    public static int returnParameter(int parameter) {
        return parameter;
    }

    public static void main(String[] args) {
        System.out.println(returnParameter(5)); // prints 5
        System.out.println(returnParameter(6)); // prints 6
        System.out.println(returnParameter(7)); // prints 7
        System.out.println(returnParameter(8)); // prints 8

    }
}
