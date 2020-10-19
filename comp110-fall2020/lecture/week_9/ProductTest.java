import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProductTest {
    @Test
    public void testLength0() {
        assertEquals(1, Product.product(new int[0]));
    }

    @Test
    public void testLength1() {
        assertEquals(5, Product.product(new int[]{5}));
    }

    @Test
    public void testLength2() {
        assertEquals(40, Product.product(new int[]{5, 8}));
    }

    @Test
    public void testLength3() {
        assertEquals(120, Product.product(new int[]{5, 8, 3}));
    }
}
