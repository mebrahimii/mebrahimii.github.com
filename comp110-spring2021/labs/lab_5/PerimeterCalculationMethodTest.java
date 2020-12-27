import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PerimeterCalculationMethodTest {
    @Test
    public void perimeter4And5Is18() {
        assertEquals(18, PerimeterCalculationMethod.calculatePerimeter(4, 5));
    }

    @Test
    public void perimeter2And3Is10() {
        assertEquals(10, PerimeterCalculationMethod.calculatePerimeter(2, 3));
    }

    @Test
    public void perimeter12And5Is34() {
        assertEquals(34, PerimeterCalculationMethod.calculatePerimeter(12, 5));
    }
}
