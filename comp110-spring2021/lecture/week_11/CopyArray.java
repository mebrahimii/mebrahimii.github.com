public class CopyArray {
    public static String[] copyArray(String[] input) {
        String[] result = new String[input.length];
        for (int index = 0; index < input.length; index++) {
            result[index] = input[index];
        }
        return result;
    }

    public static void printArray(String[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        String[] copy = copyArray(args);
        System.out.println("Command-line arguments:");
        printArray(args);
        System.out.println("Copy:");
        printArray(copy);
    }
}
