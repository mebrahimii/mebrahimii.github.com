import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ModTest {
    @Test
    public void zeroModOneIsZero() {
        assertEquals(Mod.modBoth(0, 1), 0);
    }

    @Test
    public void oneModOneIsZero() {
        assertEquals(Mod.modBoth(1, 1), 0);
    }

    @Test
    public void twoModOneIsZero() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 2 and 1, and
        // then use assertEquals to ensure that
        // the result is 0.
    }

    @Test
    public void twoModTwoIsZero() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 2 and 2, and
        // then use assertEquals to ensure that
        // the result is 0.
    }

    @Test
    public void threeModTwoIsOne() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 3 and 2, and
        // then use assertEquals to ensure that
        // the result is 1.
    }

    @Test
    public void fiveModTwoIsOne() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 2, and
        // then use assertEquals to ensure that
        // the result is 1.
    }

    @Test
    public void fiveModThreeIsTwo() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 3, and
        // then use assertEquals to ensure that
        // the result is 2.
    }

    @Test
    public void fiveModFourIsOne() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 4, and
        // then use assertEquals to ensure that
        // the result is 1.
    }

    @Test
    public void fiveModFiveIsZero() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 5, and
        // then use assertEquals to ensure that
        // the result is 0.
    }

    @Test
    public void fiveModSixIsFive() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 6, and
        // then use assertEquals to ensure that
        // the result is 5.
    }

    @Test
    public void fiveModSevenIsFive() {
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 7, and
        // then use assertEquals to ensure that
        // the result is 5.
    }
}
