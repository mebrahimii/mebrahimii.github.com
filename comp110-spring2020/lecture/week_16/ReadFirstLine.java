import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFirstLine {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File(args[0]);
        Scanner input = new Scanner(myFile);

        if (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println("FIRST LINE: " + line);
        }

        input.close();
    }
}
