public class CreateArrayTwoElements1 {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = Integer.parseInt(args[0]);
        array[1] = Integer.parseInt(args[1]);
        System.out.println("First element: " + array[0]);
        System.out.println("Second element: " + array[1]);
        System.out.println("Array length: " + array.length);
    }
}
