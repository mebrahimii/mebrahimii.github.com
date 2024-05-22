import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class BigIf {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("big_if_test_int.txt"));
        int myInt = input.nextInt();
        input.close();
        int printInt;

        if (myInt == 0 || myInt >= 500) {
            printInt = 0;
        } else 
            if ((myInt > 5 && myInt < 22) || (myInt > 50 && myInt < 100)) {
                printInt = 1;
            } else {
                printInt = 2;
        }

        System.out.println(printInt);
    }
}

