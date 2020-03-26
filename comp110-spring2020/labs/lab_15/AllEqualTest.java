import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AllEqualTest {
    @Test
    public void testLength0() {
        assertEquals(true,
                     AllEqual.allEqual(new int[0]));
    }

    @Test
    public void testLength1() {
        assertEquals(true,
                     AllEqual.allEqual(new int[]{0}));
    }

    @Test
    public void testLength2Equal() {
        assertEquals(true,
                     AllEqual.allEqual(new int[]{0, 0}));
    }

    @Test
    public void testLength2NotEqual() {
        assertEquals(false,
                     AllEqual.allEqual(new int[]{0, 1}));
    }

    @Test
    public void testLength3Equal() {
        assertEquals(true,
                     AllEqual.allEqual(new int[]{0, 0, 0}));
    }

    @Test
    public void testLength3NotEqualFirst() {
        assertEquals(false,
                     AllEqual.allEqual(new int[]{1, 0, 0}));
    }

    @Test
    public void testLength3NotEqualSecond() {
        assertEquals(false,
                     AllEqual.allEqual(new int[]{0, 1, 0}));
    }

    @Test
    public void testLength3NotEqualThird() {
        assertEquals(false,
                     AllEqual.allEqual(new int[]{0, 0, 1}));
    }
}