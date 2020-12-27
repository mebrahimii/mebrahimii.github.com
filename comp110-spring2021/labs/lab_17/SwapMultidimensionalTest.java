import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class SwapMultidimensionalTest {
    // Causes test case failure if the two given two-dimensional
    // arrays are in any way different.
    public static void assert2DEquals(int[][] first, int[][] second) {
        // This method should call fail() if the two given arrays are
        // of different lengths. If the two given arrays are of the
        // same length, then it should call assertArrayEquals for
        // each pair of rows. assertArrayEquals will trigger test
        // case failure if there is any difference between the
        // contents of two rows.
        // TODO - write your code below this comment.
    }

    @Test
    public void testSwapRows0_0() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        SwapMultidimensional.swapRows(orig, 0, 0);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapRows0_1() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 4, 5, 6 },
                         new int[]{ 1, 2, 3 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        SwapMultidimensional.swapRows(orig, 0, 1);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapRows0_2() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 7, 8, 9 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 1, 2, 3 },
                         new int[]{ 0, 1, 2 } };
        SwapMultidimensional.swapRows(orig, 0, 2);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapRows0_3() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 0, 1, 2 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 1, 2, 3 } };
        SwapMultidimensional.swapRows(orig, 0, 3);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapRows1_3() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 0, 1, 2 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 4, 5, 6 } };
        SwapMultidimensional.swapRows(orig, 1, 3);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapRows2_3() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 0, 1, 2 },
                         new int[]{ 7, 8, 9 } };
        SwapMultidimensional.swapRows(orig, 2, 3);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapCols0_0() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };

        SwapMultidimensional.swapCols(orig, 0, 0);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapCols0_1() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 2, 1, 3 },
                         new int[]{ 5, 4, 6 },
                         new int[]{ 8, 7, 9 },
                         new int[]{ 1, 0, 2 } };

        SwapMultidimensional.swapCols(orig, 0, 1);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapCols0_2() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 3, 2, 1 },
                         new int[]{ 6, 5, 4 },
                         new int[]{ 9, 8, 7 },
                         new int[]{ 2, 1, 0 } };

        SwapMultidimensional.swapCols(orig, 0, 2);
        assert2DEquals(orig, expected);
    }

    @Test
    public void testSwapCols1_2() {
        int[][] orig =
            new int[][]{ new int[]{ 1, 2, 3 },
                         new int[]{ 4, 5, 6 },
                         new int[]{ 7, 8, 9 },
                         new int[]{ 0, 1, 2 } };
        int[][] expected =
            new int[][]{ new int[]{ 1, 3, 2 },
                         new int[]{ 4, 6, 5 },
                         new int[]{ 7, 9, 8 },
                         new int[]{ 0, 2, 1 } };

        SwapMultidimensional.swapCols(orig, 1, 2);
        assert2DEquals(orig, expected);
    }
}
