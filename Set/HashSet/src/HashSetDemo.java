import java.util.HashSet;

import java.util.*;

public class HashSetDemo {
    HashSet<Student> hs1 = new HashSet();

    public void addStudent(int roll, String name, int total) {
        Student student = new Student(name, roll, total);
        hs1.add(student);
        System.out.println("Data added to hs1:");

    }

    public void display() {
        for (Student temp : hs1) {
            System.out.println(temp.getName() + " " + temp.getTotalMarks());
        }
    }

    public void deleteRollNumber(int rollNo) {
        for (Student temp : hs1) {
            if (temp.getRollNo() == rollNo) {
                hs1.remove(temp);
                System.out.println("Data removed from hs1:");
                break;
            }
        }
    }

    public static void main(String[] args) {
        HashSetDemo obj = new HashSetDemo();
        obj.addStudent(101, "adf", 300);
        obj.addStudent(102, "adsf", 121);

        obj.display();
        obj.deleteRollNumber(102);
        obj.display();
    }

}
