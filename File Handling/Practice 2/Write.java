import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.*;

public class Write {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("file.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        // dos.writeUTF("Hello, world!");
        // dos.writeChar('G');
        dos.writeBytes("hsfd");
        // fos.write(101);
        // byte[] arr = { 98, 99, 100 };
        // fos.write(arr);
    }
}
