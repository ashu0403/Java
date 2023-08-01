import java.util.*;

public class Third {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
            
            
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " ");
        }
    }
}
