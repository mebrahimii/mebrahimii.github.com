import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100); // between 0 (inclusive) and 100 (exclusive)
        System.out.println("Random number: " + num);
    }
}
