public class Product {
    public static int product(int[] array) {
        int result = 1;
        for (int index = 0; index < array.length; index++) {
            result *= array[index];
        }
        return result;
    }
}
