import java.util.HashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Second {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        set1.add("Name");
        set1.add(1);
        set1.add(0.3f);
        set1.add(2.01);
        set1.add("hello");
        TreeSet set2 = new TreeSet();
        set2.add("Name");
        // set2.add(1);
        for (Object temp1 : set2) {
            System.out.print(temp1 + " ");
        }
        for (Object temp : set1) {
            System.out.print(temp + " ");
        }
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}