import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class AbsoluteValue {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("one_negative_int.txt"));
        int myInt = input.nextInt();
        input.close();

        if (myInt < 0) {
            myInt = -myInt;
        }

        System.out.println(myInt);
    }
}
