import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GenericsDemo {
    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
    String s=sc.next();
            list.add(s);
        if (s.startsWith("e")) {
            {
                break;
            }
        }

    }
    Iterator iter = list.iterator();
    while(iter.hasNext()){
        System.out.println(iter.next());
    }

}
}
