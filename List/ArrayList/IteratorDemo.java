import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
    ArrayList a1 = new ArrayList();
    Iterator it = a1.iterator();
    a1.add(10);
    a1.add(20);
    a1.add(30);
    while (it.hasNext()) {
        System.out.println(it.next());
    }
        System.out.println("End of the program");
    }


}
