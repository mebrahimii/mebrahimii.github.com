public class MultParameters2 {
    // returns an integer
    // takes two integer parameters, and binds their values to
    // the variables x and y
    public static int multParameters2(int x, int y) {
        // new variables can be introduced as usual
        int result = x * y;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multParameters2(3, 4)); // prints 12
        System.out.println(multParameters2(4, 4)); // prints 14
        System.out.println(multParameters2(4, 5)); // prints 20
    }
}
