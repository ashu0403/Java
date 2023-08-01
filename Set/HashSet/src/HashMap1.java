import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Long> contact = new HashMap<>();
        contact.put("Gaurav", 1233l);
        System.out.println(contact);
        HashMap<Integer, Student> studentInfo = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no");
        int rollNo = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter total Marks");
        int totalMarks = sc.nextInt();
        
    }
}
