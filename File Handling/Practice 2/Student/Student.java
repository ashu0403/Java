import java.io.Serializable;

public class Student implements Serializable {
    int Id;
    String Name;
    String className;
    float percentage;
    char gender;

    public Student(int Id, String Name, String className, float percentage, char gender) {
        this.Id = Id;
        this.Name = Name;
        this.className = className;
        this.percentage = percentage;
        this.gender = gender;
    }
}