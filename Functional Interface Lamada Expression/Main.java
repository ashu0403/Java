import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Calc multi = new Calc() {
            public Double calculation(Double n, Double n1) {
                return n1 * n;
            }
        };
        Calc sub = new Calc() {
            public Double calculation(Double n, Double n1) {
                return Math.pow(n1, n);
            }
        };
        System.out.println(multi.calculation(12d, 122d));
        System.out.println(sub.calculation(12d, 222d));
        Calc devide = (Double a, Double b) -> a / b;
        System.out.println(devide.calculation(12d, 22d));

    }
}
