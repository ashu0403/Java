public class Student {
    String name;
    int rollNo;
    int Totalmarks;

    public Student(String name, int rollNo, int totalmarks) {
        this.name = name;
        this.rollNo = rollNo;
        Totalmarks = totalmarks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", Totalmarks=" + Totalmarks + "]";
    }

}