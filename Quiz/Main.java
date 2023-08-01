import java.util.*;

class Main {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(new Long(10));
        s.add(new Integer(10));
        System.out.println("Demo :");
        for (Object object : s) {
            System.out.print(" " + object);
        }
    }
}