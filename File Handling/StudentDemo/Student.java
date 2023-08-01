public class Student {
    int rollno;
    String Name;
    int maths, science, English, attendance;

    public Student(String name, int rollno, int maths, int science, int English, int attendance) {
        this.Name = name;
        this.rollno = rollno;
        this.maths = maths;
        this.science = science;
        this.English = English;
        this.attendance = attendance;
    }

    int TotalMarks() {
        return maths + science + English;
    }

    int AverageOFMaths(Student[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].maths;
        }
        return sum / arr.length;
    }
    

}