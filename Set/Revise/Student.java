public class Student{
    private String Name;
    private int rollNo;
    private int totalMarks;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    @Override
    public String toString() {
        return "Student [Name=" + Name + ", rollNo=" + rollNo + ", totalMarks=" + totalMarks + "]";
    }
    public Student(String name, int rollNo, int totalMarks) {
        this.Name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }
    
}