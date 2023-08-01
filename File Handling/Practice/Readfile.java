import java.io.*;

public class Readfile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        int check;
        while ((check = fis.read()) != 1) {
            System.out.println((char) check);
        }
        System.out.println(check);
        System.out.println(fis.read());
    }
}
