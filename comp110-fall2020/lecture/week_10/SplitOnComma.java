public class SplitOnComma {
    public static void printArray(String[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        String[] splitResult = args[0].split(",");
        printArray(splitResult);
    }
}
