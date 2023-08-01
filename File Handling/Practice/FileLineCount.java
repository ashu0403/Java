import java.io.*;

public class FileLineCount {
    public static void main(String[] args) throws Exception {
        // read line count from file.txt
        FileReader reader = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(reader);
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        System.out.println("count: " + count);
    }
}
