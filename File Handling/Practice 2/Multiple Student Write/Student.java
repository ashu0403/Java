package School;

import java.io.Serializable;

public class Student implements Serializable {
    int rollno;
    String name;
    int age;
    String classname;
    int maths;
    int science;
    int english;
    float attendance;

    public Student(int rollno, String name, int age, String classname, int maths, int science, int english, float attendance) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.classname = classname;
        this.maths = maths;
        this.science = science;
        this.english = english;
        this.attendance = attendance;
    }
}
