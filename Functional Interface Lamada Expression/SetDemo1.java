import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class SetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("mahesh");
        linkedHashSet.add("dharshan");
        linkedHashSet.add("aswini");
        linkedHashSet.add("aswini");
        linkedHashSet.forEach((temp) -> System.out.println(temp));
        for (String temp : linkedHashSet) {
            if (temp.startsWith("a")) {
                System.out.println(temp);
            }
            System.out.println("==================================================================");
            Set<String> result = linkedHashSet.stream().filter(temp1 -> temp.startsWith("a") || temp.startsWith("d"))
                    .collect(Collectors.toSet());
            System.out.println(result);
        }
    }
}