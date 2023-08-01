import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.*;

public class Write {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id : ");
        int id = sc.nextInt();
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter Class Name : ");
        String className = sc.next();
        System.out.print("Enter Percentage : ");
        float percentage = sc.nextFloat();
        System.out.print("Enter Gender : ");
        char gender = sc.next().charAt(0);
        Student s = new Student(id, name, className, percentage, gender);
        FileOutputStream fos = new FileOutputStream("info.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        FileInputStream fis = new FileInputStream("info.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
    }
}
