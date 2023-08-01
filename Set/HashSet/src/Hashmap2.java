import java.util.*;

public class Hashmap2 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        map.put(120, 651);
        map.put(130, 652);
        map.put(140, 653);
        map.put(110, 654);
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

    }
}
