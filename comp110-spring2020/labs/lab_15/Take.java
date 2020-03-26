public class Take {
    // You will need to write a method that "takes" a given number
    // of elements from a given array, producing a new array
    // holding the elements "taken".  The original array is
    // unchanged.
    //
    // For example, if we call:
    //
    // take(new String[]{"first", "second", "third"}, 1)
    //
    // ...the result should be the String array:
    //
    // {"first"}
    //
    // ...because 1 element was "taken" (always from the front).
    //
    // If the number of elements to take exceeds the number
    // of elements in the array, then take as many as can be taken.
    // For example, if we call:
    //
    // take(new String[]{"hi", "bye"}, 25)
    //
    // ...the result should be the String array:
    //
    // {"hi", "bye"}
    //
    // Even though 25 elements were requested in the above example,
    // since the array only held 2 elements, the same 2 elements
    // are returned.
    //
    // If no elements are to be taken, then an empty array is
    // returned.  For example, with the call:
    //
    // take(new String[]{"one", "two", "three"}, 0)
    //
    // ...the result should be an empty String array.  This behavior
    // should also occur if a negative number of elements are
    // requested.
    //
    // Two hints:
    // 1.) Math.min may come in handy.
    // 2.) It is possible to implement this without any if statements.
    //
    // TODO - write your code below this comment.
    //
    
    // DO NOT MODIFY printArray!
    public static void printArray(String[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        String[] taken = take(args, 3);
        printArray(taken);
    }
}
