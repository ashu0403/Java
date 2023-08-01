import java.util.HashSet;
import java.util.Set;


public class First{
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("a");
        set.add("b");
        System.out.println("Data in set : "+set);
        //Search
        System.out.println("Does set contain a"+set.contains("a"));
        System.out.println("Size of set : "+set.size());
        


    }
}