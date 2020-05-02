import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWholeFile {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File(args[0]);
        Scanner input = new Scanner(myFile);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }

        input.close();
    }
}
