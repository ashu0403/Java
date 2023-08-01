import java.util.*;

public class EmDemo {
    public static void main(String[] args) {
        Emp e1 = new Emp("iaurav", 101, "manager0", 90000);
        Emp e2 = new Emp("loid", 152, "devloper1", 90200);
        Emp e3 = new Emp("aaruto", 103, "devloper2", 12233);
        List<Emp> list = new ArrayList<>();
        list.add(e1);
        list.add(e3);
        list.add(e2);
        Collections.sort(list);
        for (Emp temp : list) {
            System.out.println(temp.EID + " " + temp.Ename + " " + temp.Designation);
        }
        System.out.println("----------------------------------------------------------------");
        EIDCoparator eidc = new EIDCoparator();
        Collections.sort(list, eidc);
        for (Emp temp : list) {
            System.out.println(temp.EID + " " + temp.Designation + " " + temp.Ename + " " + temp.Salary);
        }
        System.out.println("----------------------------------------------------------------");
        Collections.sort(list, new DesignationComparator());
        for (Emp temp : list) {
            System.out.println(temp.EID + " " + temp.Designation + " " + temp.Ename + " " + temp.Salary);
        }

    }

}
