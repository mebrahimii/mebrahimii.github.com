import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testGetWidth() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(2, r.getWidth());
    }

    @Test
    public void testSetWidth() {
        Rectangle r = new Rectangle(2, 3);
        r.setWidth(5);
        assertEquals(5, r.getWidth());
    }
    
    @Test
    public void testGetHeight() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(3, r.getHeight());
    }

    @Test
    public void testSetHeight() {
        Rectangle r = new Rectangle(2, 3);
        r.setHeight(5);
        assertEquals(5, r.getHeight());
    }

    @Test
    public void testGetPerimeter() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(10, r.getPerimeter());
    }

    @Test
    public void testToString() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals("Rectangle(2, 3)",
                     r.toString());
    }
}
