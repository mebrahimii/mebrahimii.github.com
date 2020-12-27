public class MultiplyWithFor {
    // Only works with non-negative values (0 and positive)
    public static int multiply(int a, int b) {
        // Weird things:
        // 1.) The initializer is empty.  While result looks like
        //     it should be in the initializer, if we declared
        //     result in the initializer, it'd only be in scope
        //     for the loop itself.  However, since we want to
        //     return it outside of the loop, it must be in scope
        //     outside of the loop.
        //
        // 2.) There are two variables updated per iteration: result and b.
        //     If we want to update multiple variables, we separate them
        //     with commas.
        //
        // 3.) The body of the loop is empty.  This is ok; all the real
        //     "work" ends up being done here in the increment.
        //
        int result = 0;
        for (; b > 0; b = b - 1) {
         result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        System.out.println(multiply(first, second));
    }
}
