import java.io.FileInputStream;
import java.io.IOException;

public class First {
    // file handling
    // fileinputStream
    public static void main(String[] args) throws IOException {
        // read
        FileInputStream obj = new FileInputStream("file.txt");
        for (int i = 0; i <= 15; i = i + 1) {
            System.out.println(obj.read());
        }

        int check;
        while ((check = obj.read()) != -1) {
            System.out.println((char) check);
        }

        // Available files
    }
}