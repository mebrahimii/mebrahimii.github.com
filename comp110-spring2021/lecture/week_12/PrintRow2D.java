public class PrintRow2D {
    public static void printRow2D(int[][] array, int row) {
        for (int column = 0; column < array[row].length; column++) {
            System.out.print(array[row][column] + " ");
        }
        System.out.println(); // print a newline
    }

    public static void main(String[] args) {
        int[][] example = new int[][]{ new int[]{0, 1, 2},
                                       new int[]{3, 4, 5},
                                       new int[]{6, 7, 8},
                                       new int[]{9} };
        printRow2D(example, Integer.parseInt(args[0]));
    }
}
