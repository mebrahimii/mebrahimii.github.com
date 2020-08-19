import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AddValueNewArrayTest {
    @Test
    public void testLength0() {
        int[] array = new int[0];
        int[] newArray = AddValueNewArray.addValueNew(0, array);
        assertArrayEquals(new int[0], array);
        assertArrayEquals(new int[0], newArray);
    }

    @Test
    public void testLength1() {
        int[] array = new int[]{5};
        int[] newArray = AddValueNewArray.addValueNew(3, array);
        assertArrayEquals(new int[]{5}, array);
        assertArrayEquals(new int[]{8}, newArray);
    }

    @Test
    public void testLength2() {
        int[] array = new int[]{5, 4};
        int[] newArray = AddValueNewArray.addValueNew(3, array);
        assertArrayEquals(new int[]{5, 4}, array);
        assertArrayEquals(new int[]{8, 7}, newArray);
    }

    @Test
    public void testLength3() {
        int[] array = new int[]{5, 4, 3};
        int[] newArray = AddValueNewArray.addValueNew(3, array);
        assertArrayEquals(new int[]{5, 4, 3}, array);
        assertArrayEquals(new int[]{8, 7, 6}, newArray);
    }
}
