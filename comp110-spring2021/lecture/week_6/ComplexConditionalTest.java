import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexConditionalTest {
    // param == 5
    @Test
    public void test5() {
        assertEquals(0, ComplexConditional.someMethod(5));
    }

    // param < 0
    @Test
    public void testNegative() {
        assertEquals(0, ComplexConditional.someMethod(-1));
    }

    // param > 7 && param <= 20
    @Test
    public void testBetween8And20() {
        assertEquals(1, ComplexConditional.someMethod(9));
    }

    // param > 7 && param <= 20, specifically
    // the end of the range (20)
    @Test
    public void test20() {
        assertEquals(1, ComplexConditional.someMethod(20));
    }

    // !(param < 100) is equivalent to:
    // param >= 100.  Tests the end of the range
    @Test
    public void test100() {
        assertEquals(2, ComplexConditional.someMethod(100));
    }

    // !(param < 100) is equivalent to:
    // param >= 100.  Tests a value strictly bigger
    @Test
    public void test101() {
        assertEquals(2, ComplexConditional.someMethod(101));
    }

    // } else {
    // the only way we can get here is to produce
    // something that is < 100, but gets through
    // all the other tests.
    @Test
    public void testNotLessThan100() {
        assertEquals(3, ComplexConditional.someMethod(50));
    }
}
