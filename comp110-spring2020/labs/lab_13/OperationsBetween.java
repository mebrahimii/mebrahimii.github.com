public class OperationsBetween {
    // You must define the following:
    // 1.) Two private instance variables, min and max
    //
    // 2.) A constructor which takes initial values for
    //     min and max
    //
    // 3.) An instance method named sum, which sums the
    //     values between min and max and returns the
    //     result.  For example, if min = 3 and max = 5,
    //     then this should return 12 (3 + 4 + 5).  If
    //     min is greater than max, then this should
    //     return 0.
    //
    // 4.) An instance method named product, which
    //     multiplies the values between min and max and
    //     returns the result.  For example, if min = 6
    //     and max = 9, then this should return 3024
    //     (6 * 7 * 8 * 9).  If min is greater than
    //     max, then this should return 1.  A stub has
    //     been provided that simply returns 1; this is
    //     just to allow things to compile while you're
    //     working on the sum method.

    public int product() {
        // You'll need to replace this code with something
        // else to make product() work; this is just to make
        // things compile while you work on sum()
        return 1;
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        OperationsBetween between =
            new OperationsBetween(Integer.parseInt(args[0]),
                                  Integer.parseInt(args[1]));
        System.out.println("Sum: " + between.sum());
        System.out.println("Product: " + between.product());
    }
}
