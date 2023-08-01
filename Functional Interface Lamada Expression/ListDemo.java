import java.util.*;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(33);
        list.add(100);
        list.add(224);
        System.out.println(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.forEach((temp1) -> System.out.println(temp1));
        System.out.println("========================");
        Iterator it = list.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());
        }
        System.out.println("=== ~~");
        list.forEach((n) -> {
            if (n > 10) {
                System.out.println(n);
            }
        });

        List<Integer> var = list.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println(var);
        var.forEach((temp) -> {
            System.out.println(temp);
        });
    }
}
