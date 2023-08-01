import java.util.*;
public class Another {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("name");
        for (Object temp : list) {
            System.out.println((Integer) temp);

        }
    }
}
