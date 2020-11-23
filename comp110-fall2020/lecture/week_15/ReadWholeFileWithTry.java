import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWholeFileWithTry {
    public static void main(String[] args) {
        File myFile = new File(args[0]);
        try {
            Scanner input = new Scanner(myFile);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file: " + args[0]);
        }
    }
}
