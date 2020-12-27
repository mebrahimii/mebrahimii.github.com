public class MultiplyWithWhile {
    // Only works with non-negative values (0 and positive)
    public static int multiply(int a, int b) {
        int result = 0;
        while (b > 0) {
            result = result + a;
            b = b - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        System.out.println(multiply(first, second));
    }
}
