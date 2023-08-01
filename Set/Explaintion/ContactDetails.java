import java.util.*;
public class ContactDetails
{
    public static void main(String[] args) {
        HashMap<String,Long> contact=new HashMap<>();
        contact.put("Shikha",6877898264L);
        contact.put("xy",645678900L);
        System.out.println(contact);
        HashMap<Integer,Student> studentInfo=new HashMap<>();
        //101 abc 101 300
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter roll no");
        int rollno= scan.nextInt();
        System.out.println("Enter name");
        String name=scan.next();
        System.out.println("Enter total");
        int total= scan.nextInt();
        Student student=new Student(name,rollno,total);
        studentInfo.put(rollno,student);
        for(Map.Entry<Integer,Student> temp:studentInfo.entrySet())
        {
            System.out.println(temp.getValue().getName());
        }
    }
}