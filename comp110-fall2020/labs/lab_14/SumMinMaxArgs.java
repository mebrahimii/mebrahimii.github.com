public class SumMinMaxArgs {
    // You will need to write the following:
    //
    // 1. A constructor that takes a reference to an array,
    //    and initializes an instance variable with this
    //    array reference
    //
    // 2. An instance method named sum, which will calculate
    //    the sum of the elements in the array.  If the array
    //    is empty (contains no elements), then this will
    //    will return 0.  You will need a loop for this.
    //
    // 3. An instance method named min, which will return
    //    whichever element in the array is smallest.
    //    You can assume that min will only be called if the
    //    array is non-empty (contains at least one element).
    //    You will need a loop for this.  You may use the
    //    Math.min method here (see link below for more)
    //    https://www.tutorialspoint.com/java/lang/math_min_int.htm
    //
    // 4. An instance method named max, which will return
    //    whichever element in the array is largest.
    //    You can assume that max will only be called if the
    //    array is non-empty (contains at least one element).
    //    You will need a loop for this.  You may use the
    //    Math.max method here (see link below for more)
    //    https://www.tutorialspoint.com/java/lang/math_min_int.htm
    //
    // TODO - write your code below

    
    // DO NOT MODIFY parseStrings!
    public static int[] parseStrings(String[] strings) {
        int[] retval = new int[strings.length];
        for (int x = 0; x < strings.length; x++) {
            retval[x] = Integer.parseInt(strings[x]);
        }
        return retval;
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        int[] argsAsInts = parseStrings(args);
        SumMinMaxArgs obj = new SumMinMaxArgs(argsAsInts);
        System.out.println("Sum: " + obj.sum());
        System.out.println("Min: " + obj.min());
        System.out.println("Max: " + obj.max());
    }
}
