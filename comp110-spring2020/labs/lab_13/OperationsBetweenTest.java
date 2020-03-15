import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OperationsBetweenTest {
    public static OperationsBetween makeOp(int min, int max) {
        return new OperationsBetween(min, max);
    }
    
    @Test
    public void testSumOutOfRange() {
        assertEquals(0, makeOp(0, -1).sum());
    }

    @Test
    public void testSumRange1() {
        assertEquals(2, makeOp(2, 2).sum());
    }

    @Test
    public void testSumRange2() {
        assertEquals(5, makeOp(2, 3).sum());
    }

    @Test
    public void testSumRange3() {
        assertEquals(9, makeOp(2, 4).sum());
    }

    @Test
    public void testProductOutOfRange() {
        assertEquals(1, makeOp(0, -1).product());
    }

    @Test
    public void testProductRange1() {
        assertEquals(3, makeOp(3, 3).product());
    }

    @Test
    public void testProductRange2() {
        assertEquals(6, makeOp(2, 3).product());
    }

    @Test
    public void testProductRange3() {
        assertEquals(24, makeOp(2, 4).product());
    }
}
