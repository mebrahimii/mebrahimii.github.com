import java.util.Scanner;

public class InstanceOfExample {
    public static void main(String[] args) {
        Object example = new InstanceOfExample();
        Object input = new Scanner(System.in);

        System.out.println("example instanceof Object: " +
                           (example instanceof Object));
        System.out.println("example instanceof InstanceOfExample: " +
                           (example instanceof InstanceOfExample));
        System.out.println("example instanceof Scanner: " +
                           (example instanceof Scanner));
        System.out.println("input instanceof Object: " +
                           (input instanceof Object));
        System.out.println("input instanceof InstanceOfExample: " +
                           (input instanceof InstanceOfExample));
        System.out.println("input instanceof Scanner: " +
                           (input instanceof Scanner));
    }
}
