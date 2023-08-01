import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileWriter fw = new FileWriter("file.txt");
        int a = 10;
        String s = "java";
        char[] arr = { 'a', 'b', 'c', 'd', 'e' };
        fw.write(a);
        fw.write(s);
        fw.write(arr);
        fw.close();

    }
}
