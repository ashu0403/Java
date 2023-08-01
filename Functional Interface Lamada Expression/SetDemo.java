import java.util.*;
import java.util.stream.Collectors;

public class SetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("he");
        set.add("his");
        set.add("hais");
        set.add("hiedfs");
        set.add("Ahim");
        // System.out.println(set);
        // set.forEach((temp) -> System.out.println(temp));
        for (String temp : set) {
            if (temp.charAt(0) == 'h') {
                System.out.print(temp + " ");
            }
        }
        Set<String> var = set.stream().filter(temp -> temp.startsWith("h") || temp.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println(var);
    }

}
