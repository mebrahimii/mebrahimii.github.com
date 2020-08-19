import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ParseStringsTest {
    @Test
    public void testLength0() {
        assertArrayEquals(new int[0],
                          ParseStrings.parseStrings(new String[0]));
    }

    @Test
    public void testLength1() {
        assertArrayEquals(new int[]{123},
                          ParseStrings.parseStrings(new String[]{"123"}));
    }

    @Test
    public void testLength2() {
        assertArrayEquals(new int[]{123, 456},
                          ParseStrings.parseStrings(new String[]{"123", "456"}));
    }

    @Test
    public void testLength3() {
        assertArrayEquals(new int[]{123, 456, 789},
                          ParseStrings.parseStrings(new String[]{"123", "456", "789"}));
    }
}
