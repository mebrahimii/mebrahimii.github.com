public class AddValueToArray {
    // You must define the addValueTo method, which will add
    // a given value to each element of the given array.
    //
    // TODO - define your code below this comment
    //
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 6, 4};
        int valueToAdd = Integer.parseInt(args[0]);
        addValueTo(valueToAdd, array);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
