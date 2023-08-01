import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for which you want to add Even and Odd ");
        int number = sc.nextInt();
        int i;
        int sumE = 0;
        int sumO = 0;
        for (; number > 0;) {
            i = number % 10;
            if (i % 2 == 0) {
                sumE = sumE + i;
            } else {
                sumO = sumO + i;
            }
            number = number / 10;
        }
        System.out.println("The Value of Even is " + sumE);
        System.out.println("The Value of Odd is " + sumO);
    }
}
