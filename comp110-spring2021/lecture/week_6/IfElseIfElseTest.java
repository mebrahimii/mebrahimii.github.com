import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IfElseIfElseTest {
    @Test
    public void testOne() {
        assertEquals("one", IfElseIfElse.englishName(1));
    }

    @Test
    public void testTwo() {
        assertEquals("two", IfElseIfElse.englishName(2));
    }

    @Test
    public void testThree() {
        assertEquals("three", IfElseIfElse.englishName(3));
    }

    @Test
    public void testFour() {
        assertEquals("unknown", IfElseIfElse.englishName(4));
    }

    @Test
    public void testZero() {
        assertEquals("unknown", IfElseIfElse.englishName(0));
    }
}
