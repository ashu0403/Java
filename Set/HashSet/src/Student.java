public class Student{
    private String name;
    private int rollNo;
    private int TotalMarks;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getTotalMarks() {
        return TotalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        TotalMarks = totalMarks;
    }
    public Student(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        TotalMarks = totalMarks;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", TotalMarks=" + TotalMarks + "]";
    }
    
}