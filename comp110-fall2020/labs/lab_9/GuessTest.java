import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GuessTest {
    @Test
    public void testWith0() {
        assertEquals("Guess is correct!", Guess.isGuessCorrect(0, 123456l));
    }

    @Test
    public void testWith1() {
        assertEquals("Guess was incorrect.  The correct guess was: 0",
                     Guess.isGuessCorrect(1, 123456l));
    }

    @Test
    public void testWith2() {
        assertEquals("Guess was incorrect.  The correct guess was: 0",
                     Guess.isGuessCorrect(2, 123456l));
    }

    @Test
    public void testWith1DifferentSeed() {
        assertEquals("Guess was incorrect.  The correct guess was: 2",
                     Guess.isGuessCorrect(0, 654321l));
    }

    @Test
    public void testWith2DifferentSeed() {
        assertEquals("Guess is correct!", Guess.isGuessCorrect(2, 654321l));
    }
}

