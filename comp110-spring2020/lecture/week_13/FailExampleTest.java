import static org.junit.Assert.fail;
import org.junit.Test;

public class FailExampleTest {
    public static void failIfNotEqual(int x, int y) {
        if (x != y) {
            fail();
        }
    }
    
    @Test
    public void alwaysFails() {
        fail();
    }

    @Test
    public void testEqual() {
        failIfNotEqual(1, 1);
    }

    @Test
    public void testNotEqual() {
        failIfNotEqual(1, 2);
    }

    @Test
    public void testAdd() {
        failIfNotEqual(FailExample.add(1, 2), 3);
    }
}
