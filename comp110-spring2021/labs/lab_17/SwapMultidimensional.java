public class SwapMultidimensional {
    // You must write TWO methods:
    //
    // 1.) A method named "swapRows" that swaps the
    //     contents of two rows in a given two-dimensional
    //     array. This method MUST NOT use loops. As a hint,
    //     since a two-dimensional array is just an array of
    //     arrays where each inner array is a row, this means
    //     that you can swap entire rows just by swapping two
    //     elements of the outer array.
    //
    // 2.) A method named "swapCols" that swaps the contents
    //     of two columns in a given two-dimensional array.
    //     This method MUST use a loop.
    // TODO - write your code below this comment.


    // DO NOT MODIFY print2D!
    public static void print2D(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length - 1; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println(array[row][array[row].length - 1]);
        }
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        int[][] example1 = new int[][]{ new int[]{0, 1, 2},
                                        new int[]{3, 4, 5},
                                        new int[]{6, 7, 8} };
        int[][] example2 = new int[][]{ new int[]{9, 8, 7},
                                        new int[]{6, 5, 4},
                                        new int[]{3, 2, 1} };
        System.out.println("Before swapping rows 0 and 2:");
        print2D(example1);
        swapRows(example1, 0, 2);
        System.out.println("After swapping rows 0 and 2:");
        print2D(example1);

        System.out.println("\nBefore swapping columns 1 and 2:");
        print2D(example2);
        swapCols(example2, 1, 2);
        System.out.println("After swapping columns 1 and 2:");
        print2D(example2);
    }
}
