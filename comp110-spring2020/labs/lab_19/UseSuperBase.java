// DO NOT MODIFY ANYTHING IN THIS FILE!!

import java.util.Random;

public class UseSuperBase {
    private Random random;
    
    public UseSuperBase(long seed) {
        random = new Random(seed);
    }

    public int nextInt(int high) {
        return random.nextInt(high);
    }
}

