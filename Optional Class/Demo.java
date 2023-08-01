import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        String[] arr = new String[5];
        // System.out.println(arr[0]);
        Optional<String> ref = Optional.of(arr[0]);
        Optional<String> var = Optional.empty();
        System.out.println(var);
    }
}