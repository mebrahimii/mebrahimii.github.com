public class SplitOnAnything {
    public static void printArray(String[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        String[] splitResult = args[1].split(args[0]);
        printArray(splitResult);
    }
}
