abstract class Employee {
    
      public Employee() {
     System.out.println("Class Employee");
      }
    

    public void showDetails() {
        System.out.println("Show Details of parent employee...");
    }
}

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("Child");
    }

    public void showDetails() {
        System.out.println("Show Details of Manager employee...");
        super.showDetails();
    }

    public static void main(String[] args) {
        Employee employee = new Manager();
        employee.showDetails();
    }
}
