import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;

public class FileRead {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileReader fr = new FileReader(
                "Student.csv");
        BufferedReader br = new BufferedReader(fr);
        // FileInputStream fi = new FileInputStream("Student.csv");
        br.readLine();
        Student[] s = new Student[4];
        int i = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            String name = details[0];
            int rollno = Integer.parseInt(details[1]);
            // System.out.print(rollno + " ");
            int maths = Integer.parseInt(details[2]);
            int science = Integer.parseInt(details[3]);
            // System.out.println(science);
            int English = Integer.parseInt(details[4]);
            // System.out.println(English);
            int attendance = Integer.parseInt(details[5]);
            s[i] = new Student(name, rollno, maths, science, English, attendance);
            if (name.equals("Conan")) {
                System.out.println(name);
            }
            i++;
        }
        System.out.println(s[1].TotalMarks());
        System.out.println(s[0].AverageOFMaths(s));
    }
}