import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileR {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("file.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

    }

}
