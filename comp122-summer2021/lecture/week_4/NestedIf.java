import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class NestedIf {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("nested_if_test_int.txt"));
        int myInt = input.nextInt();
        input.close();
        int printInt;

        if (myInt < 10) {
            if (myInt <= 6) {
                printInt = 0;
            } else {
                printInt = 1;
            }
        } else {
            printInt = 2;
        }

        System.out.println(printInt);
    }
}
