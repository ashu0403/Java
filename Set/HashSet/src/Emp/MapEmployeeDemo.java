package Emp;

import java.util.*;

public class MapEmployeeDemo {
    HashMap<Integer, Employee> map = new HashMap<>();

    public void addEmployee(String name, int empId, String Department) {
        map.put(1, new Employee(name, empId, Department));
    }

    public void display() {
        for (Map.Entry<Integer, Employee> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " -> " + temp.getValue());

        }
    }

    public void displaydepartment(String department) {
        for (Map.Entry<Integer, Employee> temp : map.entrySet()) {
            if (temp.getValue().getDepartment().equalsIgnoreCase(department)) {
                System.out.println(temp.getKey() + " -> " + temp.getValue().getDepartment());
            }
        }
    }

    public static void main(String[] args) {
        MapEmployeeDemo d1 = new MapEmployeeDemo();
        d1.addEmployee("Gaurav", 12, "Perogramm");
        d1.display();
        d1.displaydepartment("Perogramm");
    }
}
