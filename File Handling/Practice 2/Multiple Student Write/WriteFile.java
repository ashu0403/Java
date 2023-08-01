package School;
import java.io.*;
import java.util.Scanner;

public class WriteFile {
    static int temp;
    public static void main(String[] args)throws IOException, FileNotFoundException {
        Scanner t=new Scanner(System.in);
        Student student[]=new Student[temp+10];
        FileOutputStream fr = new FileOutputStream("D:\\java Programs\\DAY 24\\src\\School\\DetailsOfStudents.txt",true);
        ObjectOutputStream ob = new ObjectOutputStream(fr);
        int i=temp;
        char exit='N';

        while(exit!='Y') {
            System.out.println("Name:");
            String name = t.next();
            System.out.println("Rollno:");
            int rollno = t.nextInt();
            System.out.println("Age: ");
            int age = t.nextInt();
            System.out.println("Class");
            String classname = t.next();
            System.out.println("Maths Marks:");
            int maths = t.nextInt();
            System.out.println("Science Marks:");
            int science = t.nextInt();
            System.out.println("English Marks:");
            int english = t.nextInt();
            System.out.println("Attendance % :");
            float attendance = t.nextFloat();
            student[i] = new Student(rollno, name, age, classname, maths, science, english, attendance);
            ob.writeObject(student[i]);
            temp=i;
            System.out.println("Exit (Y/N)");
            exit=t.next().charAt(0);

            i++;
        }
        ob.close();
    }
}
