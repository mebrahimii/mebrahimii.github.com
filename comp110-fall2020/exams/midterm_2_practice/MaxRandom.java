import java.util.Random;

public class MaxRandom {
    // Notes:
    // 1.) The constructor takes a long, which should be used
    //     as a seed to initialize a Random instance.
    //
    // 2.) The randomWithMaxInclusive method takes an int representing
    //     the greatest random value that can be returned.  For example,
    //     if given 6 as a value, randomWithMaxInclusive can return
    //     these possible values: 0, 1, 2, 3, 4, 5, 6.  Each call
    //     to randomWithMaxInclusive should use the same Random instance
    //     which was initialized in the constructor.
    //
    // TODO - write your code below this comment
    //


    // DO NOT MODIFY main!
    public static void main(String[] args) {
        MaxRandom r = new MaxRandom(Long.parseLong(args[0]));
        System.out.println("Max 1: " + r.randomWithMaxInclusive(1));
        System.out.println("Max 2: " + r.randomWithMaxInclusive(2));
        System.out.println("Max 3: " + r.randomWithMaxInclusive(3));
        System.out.println("Max 4: " + r.randomWithMaxInclusive(4));
        System.out.println("Max 5: " + r.randomWithMaxInclusive(5));
        System.out.println("Max 6: " + r.randomWithMaxInclusive(6));
    }
}
