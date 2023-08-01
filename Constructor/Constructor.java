import java.util.Arrays;

public class Constructor {
    int count = 0;

    void display() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.display();
        Constructor obj1 = new Constructor();
        obj1.display();
        String[] hello = { "g", "0", "3" };
        Arrays.sort(hello, 1, 9);
    }

}
