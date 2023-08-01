import java.util.*;

public class MapEmployeeDemo {
    public static Map<Integer, Employee> getEmployees() {
        Employee employee = new Employee("John", 1001, "HR");
        Employee employee1 = new Employee("Bob", 1002, "Accounts");
        Employee employee2 = new Employee("William", 2345, "HR");
        Employee employee3 = new Employee("Harry", 1234, "Academy");
        Employee employee4 = new Employee("Kathy", 1004, "Accounts");
        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, employee);
        map.put(2, employee1);
        map.put(3, employee2);
        map.put(4, employee3);
        map.put(5, employee4);
        return map;
    }

    public static void display(Map<Integer, Employee> employe) {
        for (Map.Entry<Integer, Employee> entry : employe.entrySet()) {
            Integer key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(
                    key + " " + employee.getName() + "  " + employee.getEmpId() + "  " + employee.getDepartment());
        }
    }

    public static Map<Integer, Employee> getEmpByDepartment(Map<Integer, Employee> employees, String department) {
        Map<Integer, Employee> newMap = new HashMap<Integer, Employee>();
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            Integer key = entry.getKey();
            Employee employee = entry.getValue();
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                newMap.put(key, employee);
            }
        }
        return newMap;
    }

    public static void main(String[] args) {
        Map<Integer, Employee> emmpmap = getEmployees();
        display(emmpmap);
        Map<Integer, Employee> newMap = getEmpByDepartment(emmpmap, "Accounts");
        System.out.println(newMap);
    }
}
