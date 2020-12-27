public class PrintCol2D {
    public static void printCol2D(int[][] array, int column) {
        for (int row = 0; row < array.length; row++) {
            if (column < array[row].length) {
                System.out.print(array[row][column] + " ");
            }
        }
        System.out.println(); // print a newline
    }

    public static void main(String[] args) {
        int[][] example = new int[][]{ new int[]{0, 1, 2},
                                       new int[]{3, 4, 5},
                                       new int[]{6, 7, 8},
                                       new int[]{9} };
        printCol2D(example, Integer.parseInt(args[0]));
    }
}
