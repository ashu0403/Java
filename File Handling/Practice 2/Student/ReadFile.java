import java.io.IOException;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("info.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1 = (Student) ois.readObject();
        System.out.println(s1.Id + " " + s1.Name + " " + s1.className + " " + s1.gender);
        Student s2 = (Student) ois.readObject();
        System.out.println(s2.Id + " " + s2.Name);
    }
}
