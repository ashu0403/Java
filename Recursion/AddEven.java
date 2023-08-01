public class AddEven {
    public static int value(int num) {
        if (num == 2) {
            return 2;
        } else if (num == 1) {
            return 1;
        } else if (num <= 0) {
            return 0;
        }
        if (num % 2 != 0) {
            num = num - 1;
        }
        return num + value(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(value(9));
    }
}
