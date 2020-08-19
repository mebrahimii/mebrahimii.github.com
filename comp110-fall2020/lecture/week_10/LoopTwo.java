public class LoopTwo {
    public static void printPairs(int[] first, int[] second) {
        for (int index = 0;
             index < first.length && index < second.length;
             index++) {
            System.out.println(first[index] + ", " + second[index]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        printPairs(arr1, arr2);
    }
}
