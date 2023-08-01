import java.io.*;

public class BufferFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");

        BufferedInputStream bs = new BufferedInputStream(fis);
        bs.mark(0);
        System.out.println((char) bs.read());
        System.out.println((char) bs.read());
        bs.reset();
        System.out.println((char) bs.read());
        bs.reset();
        bs.reset();
        bs.reset();
        bs.reset();
        bs.reset();
    }
}
