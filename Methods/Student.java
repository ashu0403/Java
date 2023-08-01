public class Student {
    String name;
    int rollno;
    char classgrade;
    char section;
    float marks;

    void display() {
        System.out.println(name + " " + rollno + " " + classgrade + " " + section + " " + marks);
    }

    public static void main(String[] args) {
        {
            Student s1 = new Student();
            s1.name = "ABC";
            s1.rollno = 41;
            s1.classgrade = 'A';
            s1.section = 'A';
            s1.marks = 99.99f;
            s1.display();

            Student s2 = new Student();
            s2.name = "Gaurav";
            s2.rollno = 42;
            s2.classgrade = 'B';
            s2.section = 'C';
            s2.marks = 65.33f;
            s2.display();
        }
    }
}
