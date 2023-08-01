import java.util.function.Function;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> add = a -> b -> c -> a + b + c;
        int result = add.apply(1).apply(2).apply(3);
        System.out.println(result);
    }
}