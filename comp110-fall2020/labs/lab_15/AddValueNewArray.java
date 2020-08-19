public class AddValueNewArray {
    // You must define the addValueNew method, which behaves
    // similarly to the addValueTo method in AddValueToArray.java.
    // However, instead of adding the given value to the given
    // array, it will return a _new_ array, where the new array
    // is the result of adding the value to each element of the
    // given array. To be clear, the given array NEVER CHANGES.
    //
    // TODO - define your code below this comment
    //

    // DO NOT MODIFY printArray!
    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 6, 4};
        int valueToAdd = Integer.parseInt(args[0]);
        int[] newArray = addValueNew(valueToAdd, array);
        System.out.println("Original array:");
        printArray(array);
        System.out.println("New array:");
        printArray(newArray);
    }
}
