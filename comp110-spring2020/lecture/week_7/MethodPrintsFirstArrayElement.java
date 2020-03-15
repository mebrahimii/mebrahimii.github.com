public class MethodPrintsFirstArrayElement {
    public static void printFirst(int[] array) {
        System.out.println(array[0]);
    }
    
    public static void main(String[] args) {
        printFirst(new int[]{42});
    }
}
