public class SumOfValue {
    public static int sum(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num + sum(--num);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}