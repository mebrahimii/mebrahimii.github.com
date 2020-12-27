import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AddValueToArrayTest {
    @Test
    public void testLength0() {
        int[] array = new int[0];
        AddValueToArray.addValueTo(0, array);
        assertArrayEquals(new int[0], array);
    }

    @Test
    public void testLength1() {
        int[] array = new int[]{5};
        AddValueToArray.addValueTo(3, array);
        assertArrayEquals(new int[]{8}, array);
    }

    @Test
    public void testLength2() {
        int[] array = new int[]{5, 4};
        AddValueToArray.addValueTo(3, array);
        assertArrayEquals(new int[]{8, 7}, array);
    }

    @Test
    public void testLength3() {
        int[] array = new int[]{5, 4, 3};
        AddValueToArray.addValueTo(3, array);
        assertArrayEquals(new int[]{8, 7, 6}, array);
    }
}
