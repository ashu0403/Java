public class CalcLmadaImpl {
    public static void main(String[] args) {
        CalcLamda obj = (a, b) -> a / b;
        System.out.println(obj.calculation(12, 2));
    }
}
