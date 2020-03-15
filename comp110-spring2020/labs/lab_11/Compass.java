import java.util.Random;
import java.util.Scanner;

public class Compass {
    // You will need to do the following:
    //
    // 1.) Define a private instance variable which can
    //     hold a reference to a Random object.
    //
    // 2.) Define a constructor which takes a seed value.
    //     This seed will be used to initialize the
    //     aforementioned Random instance variable.
    //
    // 3.) Define a static method named numberToDirection
    //     which takes a direction number and returns a String
    //     representing the direction corresponding to the given
    //     number. A snippet of code has been provied starting
    //     this implementation.
    //
    // 4.) Define an instance method named randomDirection
    //     which generates a valid random direction number
    //     and returns a String representing that direction.
    //     You MUST call numberToDirection to perform this
    //     determination. The number for the parameter to
    //     numberToDirection should be derived from the
    //     Random instance created in the constructor.
    //
    // As a hint, the overall structure of this file is
    // based on the structure used in ScoreDice.java from
    // the previous lab. You may wish to consult that file
    // as an example.
    //
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seed: ");
        long seed = input.nextLong();
        Compass compass = new Compass(seed);
        String direction = compass.randomDirection();
        System.out.println("Random direction: " + direction);
    }
}
