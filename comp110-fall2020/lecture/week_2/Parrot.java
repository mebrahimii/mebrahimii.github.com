import java.util.Scanner;

public class Parrot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter something to be repeated: ");
        String line = in.nextLine();
        System.out.println("line = " + line);
    }
}
