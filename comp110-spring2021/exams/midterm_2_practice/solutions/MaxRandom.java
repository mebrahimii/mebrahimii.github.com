import java.util.Random;

public class MaxRandom {
    private Random random;
    
    public MaxRandom(long seed) {
        random = new Random(seed);
    }

    public int randomWithMaxInclusive(int max) {
        return random.nextInt(max + 1);
    }

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
