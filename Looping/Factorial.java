import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for you Want to know Factorial ");
        long number = sc.nextInt();
        long multi = 1;
        for (; number >= 1;) {
            multi = number * multi;
            number = number - 1;
        }
        System.out.println(multi);
    }
}
