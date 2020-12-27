public class AllEqual {
    // You must define the allEqual method, which will return
    // true if either:
    // 1.) The given array contains fewer than two elements, or...
    // 2.) All elements of the array are equal to each other.
    //     As a hint, you only need to compare the first element
    //     to all subsequent elements for this check.
    //
    // TODO - define your code below this comment
    //

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
        boolean areEqual = allEqual(argsAsInts);
        System.out.println("Are equal: " + areEqual);
    }
}