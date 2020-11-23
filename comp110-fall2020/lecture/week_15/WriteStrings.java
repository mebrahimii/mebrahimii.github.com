import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteStrings {
    public static void main(String[] args) throws IOException {
        File myFile = new File("output.txt");
        FileWriter fw = new FileWriter(myFile);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello");
        bw.newLine();
        bw.write("World");
        bw.newLine();

        bw.close();
    }
}
