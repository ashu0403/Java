import javax.print.attribute.standard.MediaSize.NA;

public class Employee {
    private String designation;
    private int Salary;
    String Name;
    int age;

    public Employee(String name, int age) {
        this.Name = name;
        this.age = age;

    }

    public void displayDetails() {
        System.out.println(this.Name + "      " + this.age);
    }
}