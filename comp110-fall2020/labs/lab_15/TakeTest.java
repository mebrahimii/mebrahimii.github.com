import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TakeTest {
    @Test
    public void testLength0Take0() {
        assertArrayEquals(Take.take(new String[0], 0), new String[0]);
    }

    @Test
    public void testLength0Take1() {
        assertArrayEquals(Take.take(new String[0], 1), new String[0]);
    }

    @Test
    public void testLength1Take0() {
        assertArrayEquals(Take.take(new String[]{"hi"}, 0), new String[0]);
    }

    @Test
    public void testLength1Take1() {
        assertArrayEquals(Take.take(new String[]{"hi"}, 1),
                          new String[]{"hi"});
    }

    @Test
    public void testLength1Take2() {
        assertArrayEquals(Take.take(new String[]{"hi"}, 2),
                          new String[]{"hi"});
    }

    @Test
    public void testLength2Take0() {
        assertArrayEquals(Take.take(new String[]{"hi", "bye"}, 0),
                          new String[0]);
    }

    @Test
    public void testLength2Take1() {
        assertArrayEquals(Take.take(new String[]{"hi", "bye"}, 1),
                          new String[]{"hi"});
    }

    @Test
    public void testLength2Take2() {
        assertArrayEquals(Take.take(new String[]{"hi", "bye"}, 2),
                          new String[]{"hi", "bye"});
    }
}