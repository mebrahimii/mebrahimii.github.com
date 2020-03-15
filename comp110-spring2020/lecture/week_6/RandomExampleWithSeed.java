import java.util.Scanner;
import java.util.Random;

public class RandomExampleWithSeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seed: ");
        long seed = input.nextLong();
        Random r = new Random(seed);
        int num = r.nextInt(10);
        System.out.println("Random number between 0 and 9 inclusive: " + num);
    }
}
