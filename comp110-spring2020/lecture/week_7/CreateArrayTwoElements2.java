public class CreateArrayTwoElements2 {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int[] array = new int[]{first, second};
        System.out.println("First element: " + array[0]);
        System.out.println("Second element: " + array[1]);
        System.out.println("Array length: " + array.length);
    }
}
