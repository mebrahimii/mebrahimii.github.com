import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrianglePerimeterTest {
    @Test
    public void test1And2And3Is6() {
        assertEquals(6, TrianglePerimeter.perimeter(1, 2, 3));
    }

    @Test
    public void test3And4And5Is12() {
        assertEquals(12, TrianglePerimeter.perimeter(3, 4, 5));
    }

    @Test
    public void test1And3And6Is10() {
        assertEquals(10, TrianglePerimeter.perimeter(1, 3, 6));
    }
    
    @Test
    public void test10And13And6Is16() {
        assertEquals(39, TrianglePerimeter.perimeter(10, 13, 16));
    }

}
