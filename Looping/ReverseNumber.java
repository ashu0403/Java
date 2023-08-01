import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you wat to reverse ");
        int number = sc.nextInt();
        int y;
        for (int i = 0; number > 0; number = number / 10) {
            {
                i = number % 10;
                y = i;
            }
            // It store the value in y;
            System.out.print(y);
        }
    }
}
