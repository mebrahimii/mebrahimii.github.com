import java.util.Scanner;
import java.util.Random;

public class Guess {
    // You need to define a method with the following properties:
    // - The method's name is isGuessCorrect
    // - The method's return type is String
    // - The method's first parameter is an int, representing
    //   the user's guess
    // - The method's second parameter is a long, which acts as
    //   a seed
    // - The method must call makeRandomIntBetween0And2Inclusive with
    //   the given seed.  This method determine's what the computer's
    //   chosen number is.  If the computer's chosen number is equal
    //   to the guess, it returns the String "Guess is correct!".
    //   Otherwise, it returns the String:
    //   "Guess was incorrect.  The correct guess was: " + chosen
    //   ...where chosen is the number the computer chose.
    // TODO - write your code below this comment.
    
    // DO NOT MODIFY makeRandomIntBetween0And2Inclusive!
    public static int makeRandomIntBetween0And2Inclusive(long seed) {
        Random random = new Random(seed);
        return random.nextInt(3);
    }
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 0 and 2, inclusive: ");
        int guess = input.nextInt();
        System.out.println(isGuessCorrect(guess, 123456l));
    }
}
