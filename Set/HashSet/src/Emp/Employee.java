package Emp;
public class Employee {
    private String name;
    private int empId;
    private String Department;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
    public Employee(String name, int empId, String department) {
        this.name = name;
        this.empId = empId;
        Department = department;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", empId=" + empId + ", Department=" + Department + "]";
    }
    
}
