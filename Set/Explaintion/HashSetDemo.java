import java.util.*;
public class HashSetDemo
{
    HashSet<Student> hs1=new HashSet();
    Student student;
    public void addStudent(int roll,String name,int total)//101,abx,300
    {

        hs1.add(new Student(name,roll,total));
        System.out.println(student);
        //hs1.add("hi");
        System.out.println("data added successfully");
    }
    public void display()
    {
        
        for(Student temp:hs1)
        {
            //Student t=(Student) temp;
            System.out.println(temp.name+"   "+temp.Totalmarks);
        }
    }
    public void deletewithRollNo(int rollnumber)//local
    {
       for(Student temp:hs1)//s1 s2 s3
       {
           if(temp.rollNo==rollnumber)
           {
               hs1.remove(temp);
               System.out.println("deleted auccessfully");
             break;
           }
       }
    }

    public static void main(String[] args)
    {
        HashSetDemo hsd=new HashSetDemo();
        HashSet hs2=new HashSet();
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        System.out.println(hs2);
    }
}