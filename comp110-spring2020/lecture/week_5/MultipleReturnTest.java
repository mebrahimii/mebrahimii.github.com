import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultipleReturnTest {
    @Test
    public void testPositive() {
        assertEquals(8, MultipleReturn.absoluteValue(8));
    }

    @Test
    public void testNegative() {
        assertEquals(8, MultipleReturn.absoluteValue(-8));
    }
}
