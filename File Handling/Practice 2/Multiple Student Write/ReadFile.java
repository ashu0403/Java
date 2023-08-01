package School;
import java.io.EOFException;
import java.util.Scanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        FileInputStream fr=new FileInputStream("D:\\java Programs\\DAY 24\\src\\School\\DetailsOfStudents.txt");
        ObjectInputStream ob=new ObjectInputStream(fr);
        Scanner t=new Scanner(System.in);
        System.out.println("Enter Name and roll no. of Student whose Details u want to Search:");
        System.out.println("Name:");
        String name=t.next();
        System.out.println("Roll No.: ");
        int rollno=t.nextInt();
        Student student;
        //boolean found=false;
        try {
            while ((student = (Student) ob.readObject()) != null) {
                if (student.name.equalsIgnoreCase(name) && student.rollno == rollno) {

                    System.out.println("--------- Student Deatils ----------------");
                    System.out.println("Name: " + student.name);
                    System.out.println("Age: " + student.age);
                    System.out.println("Roll no.: " + student.rollno);
                    System.out.println("Class: " + student.classname);
                    System.out.println("Maths Marks: " + student.maths);
                    System.out.println("Science Marks: " + student.science);
                    System.out.println("English Marks: " + student.english);
                    System.out.println("Attendance % : " + student.attendance);
                    break;

                }

            }
        }catch (EOFException e){
            System.out.println("End of File");
        }




    }
}
