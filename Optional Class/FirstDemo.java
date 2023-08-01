import java.util.Optional;

public class FirstDemo {
    public static void main(String[] args) {
        Integer ref = null;
        Integer ref1 = 50;
        // ofNullable,of
        Optional<Integer> op1 = Optional.ofNullable(ref);
        Optional<Integer> op2 = Optional.of(ref1);
        // ispresent
        System.out.println(op1.isPresent());
        
        System.out.println(op1 + " " + op2);
    }
}
