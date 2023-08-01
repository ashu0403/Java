import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCharCount {
    public static void main(String[] args) throws IOException {
        // Count the number of characters in the file
        FileReader reader = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(reader);
        int count = 0;
        while (br.read() != -1) {
            count++;
        }
        System.out.println(count);
    }

}
