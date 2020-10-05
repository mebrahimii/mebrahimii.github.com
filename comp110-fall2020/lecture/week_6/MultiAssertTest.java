import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiAssertTest {
    @Test
    public void oneTestMultipleAssertions() {
        assertEquals(5, MultiAssert.returnParam(5));
        assertEquals(6, MultiAssert.returnParam(6));
        assertEquals(7, MultiAssert.returnParam(7));
    }
}
