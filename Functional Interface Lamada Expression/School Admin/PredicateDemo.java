import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;



public class PredicateDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Agon");
        list.add("John");
        list.add("Jack");
        Predicate<String> predicate = (temp) -> temp.startsWith("A") || temp.startsWith("K");
        list.forEach(
                (n) -> {
                    if (predicate.test(n))
                        System.out.println(n);
                });
        System.out.println(predicate.test("Agon"));

        // Function @FunctionalInterface
        // student obj -> student Name
        Function<List<Student>, List<String>> fucntion = (temp) -> {
            List<String> studentnamelist = new ArrayList<>();
            temp.forEach((n) -> {
                studentnamelist.add(n.StudentName);
            });
            return studentnamelist;
        };
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(101, "Gaurav", "A", 99));
        studentList.add(new Student(107, "Naruto", "A", 88));
        studentList.add(new Student(105, "Ashish", "A", 100));
        List<String> result = fucntion.apply(studentList);
        System.out.println(result);
    }

}
