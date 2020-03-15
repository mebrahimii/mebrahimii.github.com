public class MultParameters1 {
    // returns an integer
    // takes two integer parameters, and binds their values to
    // the variables `x` and `y`
    public static int multParameters1(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(multParameters1(3, 4)); // prints 12
        System.out.println(multParameters1(4, 4)); // prints 14
        System.out.println(multParameters1(4, 5)); // prints 20
    }
}
