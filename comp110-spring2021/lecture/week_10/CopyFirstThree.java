public class CopyFirstThree {
    public static String[] copyFirstThree(String[] input) {
        String[] result = new String[3];
        for (int index = 0; index < result.length; index++) {
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
        String[] copy = copyFirstThree(args);
        System.out.println("Command-line arguments:");
        printArray(args);
        System.out.println("Copy:");
        printArray(copy);
    }
}
