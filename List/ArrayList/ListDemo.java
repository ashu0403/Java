import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        List list = new ArrayList();
        l.add("java");
        l.add(64);
        l.add(12.04);
        // System.out.println(l.size());
        // System.out.println(l);
        list.add("List");
        list.add(354);
        list.add(34.014);
        list.add('A');
        // System.out.println(list.size());
        // System.out.println(list);
        // l.set(1, "replaed 64");
        // System.out.println(l);
        // l.remove(2);
        // System.out.println("removed index 2" + l);
        // System.out.println("index of 'A' : " + list.indexOf('A'));
        // System.out.println("Element at index 1 : " + list.get(1));
        l.add("added after sout");
        System.out.println(l);
        int arr[] = { 12, 24, 48 };
        l.add(arr);
        System.out.println(l);
        System.out.println(l.get(3).getClass());
        System.out.println(l.get(2).getClass());
        System.out.println(l.get(1).getClass());

        for (Object s : l) {
            if (true) {
                for (int i : arr) {
                    System.out.print(i + " ");
                }
            } else
                System.out.println(s);
        }

    }
}