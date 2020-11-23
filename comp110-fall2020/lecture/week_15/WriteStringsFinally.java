import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteStringsFinally {
    public static void throwIOException() throws IOException {
        throw new IOException();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(new File("output.txt")));
            bw.write("Hello");
            bw.newLine();

            // intentionally throw an exception;
            // World and the subsequent newline will not be written
            throwIOException();
            bw.write("World");
            bw.newLine();
        } finally {
            // file is always closed, as long as it was opened first
            // (i.e., bw is not null)
            if (bw != null) {
                bw.close();
            }
        }
    }
}
