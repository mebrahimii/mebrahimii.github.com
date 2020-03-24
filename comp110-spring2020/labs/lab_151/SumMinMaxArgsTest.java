import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SumMinMaxArgsTest {
    @Test
    public void testParseStringsLength0() {
        assertArrayEquals(SumMinMaxArgs.parseStrings(new String[0]),
                          new int[0]);
    }

    @Test
    public void testParseStringsLength1() {
        assertArrayEquals(SumMinMaxArgs.parseStrings(new String[]{"1"}),
                          new int[]{1});
    }

    @Test
    public void testParseStringsLength2() {
        assertArrayEquals(SumMinMaxArgs.parseStrings(new String[]{"1", "42"}),
                          new int[]{1, 42});
    }

    @Test
    public void testSumArrayLength0() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[0]);
        assertEquals(0, obj.sum());
    }

    @Test
    public void testSumArrayLength1() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1});
        assertEquals(1, obj.sum());
    }

    @Test
    public void testSumArrayLength2() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1, 2});
        assertEquals(3, obj.sum());
    }

    @Test
    public void testSumArrayLength3() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1, 2, 3});
        assertEquals(6, obj.sum());
    }

    @Test
    public void testSumArrayLength4() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1, 2, 3, 4});
        assertEquals(10, obj.sum());
    }
    
    @Test
    public void testMinArrayLength1() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1});
        assertEquals(1, obj.min());
    }

    @Test
    public void testMinArrayLength2MinFirst() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1, 2});
        assertEquals(1, obj.min());
    }

    @Test
    public void testMinArrayLength2MinSecond() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{2, 1});
        assertEquals(1, obj.min());
    }

    @Test
    public void testMinArrayLength3MinFirst() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1, 2, 3});
        assertEquals(1, obj.min());
    }

    @Test
    public void testMinArrayLength3MinSecond() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{2, 1, 3});
        assertEquals(1, obj.min());
    }

    @Test
    public void testMinArrayLength3MinThird() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{3, 2, 1});
        assertEquals(1, obj.min());
    }

    @Test
    public void testMaxArrayLength1() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1});
        assertEquals(1, obj.max());
    }

    @Test
    public void testMaxArrayLength2MaxFirst() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{2, 1});
        assertEquals(2, obj.max());
    }

    @Test
    public void testMaxArrayLength2MaxSecond() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{1, 2});
        assertEquals(2, obj.max());
    }

    @Test
    public void testMaxArrayLength3MaxFirst() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{3, 2, 1});
        assertEquals(3, obj.max());
    }

    @Test
    public void testMinArrayLength3MaxSecond() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{2, 3, 1});
        assertEquals(3, obj.max());
    }

    @Test
    public void testMaxArrayLength3MaxThird() {
        SumMinMaxArgs obj = new SumMinMaxArgs(new int[]{2, 1, 3});
        assertEquals(3, obj.max());
    }
} // SumMinMaxArgsTest
