import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(101, "Gaurav", "A", 99));
        studentList.add(new Student(107, "Naruto", "A", 88));
        studentList.add(new Student(105, "Ashish", "A", 100));
        Consumer<Student> consumer = (temp) -> {
            int percent = (temp.marks * 100) / 200;
            System.out.println(temp.StudentName + "   " + percent);

        };
        consumer.accept(new Student(101, "Gaurav", "A", 99));

        Consumer<Table> table = (temp) -> {
            int count = 1;
            while (count <= 10) {
                System.out.println(temp.Number * count);
                count++;
            }
        };
        System.out.println("----------------------------------------------------------------");
        Consumer<List<Student>> tempConsumer = (temp) -> {
            temp.forEach((n) -> System.out.println(n.rollno + " " + n.marks + " " +
                    n.StudentName));
        };
        tempConsumer.accept(studentList);
        System.out.println("----------------------------------");
        // Supplier fucntion interface
        Supplier<LocalDateTime> tempSupplier = () -> LocalDateTime.now();
        System.out.println(tempSupplier.get());
        table.accept(new Table(5));
    }
}
