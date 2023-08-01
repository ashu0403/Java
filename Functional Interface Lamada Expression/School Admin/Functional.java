import java.util.*;
import java.util.function.Function;

public class Functional {
    public static void main(String[] args) {
        Function<Integer, Integer> square = (n) -> n * n;
        Function<Integer, Integer> twotime = (n) -> n * 2;
        System.out.println(square.apply(9));
        System.out.println(twotime.apply(9));
        System.out.println(twotime.compose(square).apply(3));// square, twortime
        System.out.println(twotime.andThen(square).apply(3));// twotimes, square
    }
}
