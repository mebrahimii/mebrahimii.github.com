import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InRangeTest {
    @Test
    public void testInRangeAtLowEndOfRange() {
        InRange range = new InRange(5, 10);
        assertEquals(true, range.inRange(5));

        // TODO: add an assertEquals statement below which
        // checks that InRange.outOfRange returns false for the
        // same parameter above.
    }

    @Test
    public void testInRangeBetweenRange() {
        InRange range = new InRange(1, 10);
        assertEquals(true, range.inRange(5));

        // TODO: add an assertEquals statement below which
        // checks that InRange.outOfRange returns false for the
        // same parameter above.
    }

    @Test
    public void testInRangeAtHighEndOfRange() {
        InRange range = new InRange(1, 5);
        assertEquals(true, range.inRange(5));

        // TODO: add an assertEquals statement below which
        // checks that InRange.outOfRange returns false for the
        // same parameter above.
    }

    @Test
    public void testInRangeOutOfRangeLeft() {
        InRange range = new InRange(2, 10);
        assertEquals(false, range.inRange(1));

        // TODO: add an assertEquals statement below which
        // checks that InRange.outOfRange returns true for the
        // same parameter above.
    }

    @Test
    public void testInRangeOutOfRangeRight() {
        InRange range = new InRange(1, 9);
        assertEquals(false, range.inRange(10));

        // TODO: add an assertEquals statement below which
        // checks that InRange.outOfRange returns true for the
        // same parameter above.
    }
}
