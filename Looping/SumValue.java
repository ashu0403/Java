import java.util.Scanner;

public class SumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (; i < 999;) {
            int a = sc.nextInt();
            i = i + a;
        }
        System.out.println("Your value is " + i);
        if (i > 999) {
            System.out.println("The value exceeds 999");
        }
    }
}
