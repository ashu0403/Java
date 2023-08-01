public class Emp implements Comparable<Emp> {
    String Ename;
    int EID;
    String Designation;
    double Salary;

    // use collection compareto
    public Emp(String Ename, int EID, String Designation, double Salary) {
        this.Ename = Ename;
        this.EID = EID;
        this.Designation = Designation;
        this.Salary = Salary;
    }

    // sort based on string
    public int compareTo(Emp e) {
        return this.Ename.compareTo(e.Ename);
    }

}
