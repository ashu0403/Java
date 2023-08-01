package Revise;

import java.util.*;

public class StudentImple {
    public static void main(String[] args) {
        Studetnt e1 = new Studetnt(12, 44, "Gaurav");
        Studetnt e2 = new Studetnt(9, 43, "agon");
        List<Studetnt> students = new ArrayList<>();
        students.add(e1);
        students.add(e2);
        Collections.sort(students);
        for (Studetnt studetnt1 : students) {
            System.out.println(studetnt1);
        }

    }
}
