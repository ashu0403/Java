import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Admin {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(101, "Gaurav", "A", 99));
        studentList.add(new Student(107, "Naruto", "A", 88));
        studentList.add(new Student(105, "Ashish", "A", 100));
        // student details
        studentList.forEach(temp -> System.out.println(temp.StudentName + " " + temp.rollno));
        System.out.println("--------------------------------");
        // print marks>90
        List<Student> marksmorethan90 = studentList.stream().filter(temp -> temp.marks > 90)
                .collect(Collectors.toList());
        marksmorethan90.forEach(temp -> System.out.println(temp.marks));

        // sort based on name

        // comparbale compareTo(obj)
        // Comparable<Student> compare = (temp)->
        // this.studentName.compareTo(temp.StudentName);
        System.out.println("-------------      ----------------");
        Comparator<Student> comparator = (student1, student2) -> student1.StudentName.compareTo(student2.StudentName);
        Collections.sort(studentList, comparator);
        studentList.forEach(temp -> System.out.println(temp.StudentName + " " + temp.rollno + " " + temp.marks));
    }

}
