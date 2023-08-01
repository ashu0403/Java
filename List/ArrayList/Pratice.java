import java.util.*;

public class Pratice {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hell");
        list.add(10);
        list.add(20);
        System.out.println("original list: " + list);
        System.out.println(list.lastIndexOf(list));

        for (Object object : list) {
            String number = (String) object;
            System.out.println(number);
        }

    }
}
