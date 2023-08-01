import java.io.*;

public class StringBuffer {
    public static void main(String[] args) throws Exception {
        // read multiple line from file
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String line = null;
        StringBuffer sb = new StringBuffer();
        try {
            while ((line = br.readLine()) != null) {
                ((Appendable) sb).append(line);
                ((Appendable) sb).append("\n");
            }
        } catch (Exception e) {
            System.out.println("Eneter the data");
        }
        ;
    }
}