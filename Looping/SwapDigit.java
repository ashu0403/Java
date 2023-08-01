import java.util.Scanner;

public class SwapDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long ip = sc.nextLong();
        Long value = ip;
        Long evenCount = 0l;
        Long oddCount = 0l;
        for (; ip > 0;) {
            Long i = ip % 10;
            if (i % 2 == 0)
                evenCount++;
            else
                oddCount++;
            ip = ip / 10;
        }

        if (evenCount % 2 == 0 && oddCount % 2 == 0) {
            while (value > 0) {
                Long i = value % 10;
                Long i1 = i;
                System.out.println(i1);
                value = value / 10;
            }
        } else {
            System.out.println("Odd");
        }

    }
}
