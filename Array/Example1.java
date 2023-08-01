import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        System.out.println("How many values you want to enter ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        int sum = 0;
        int sumO = 0;
        for (int index = 0; index < size; index++) {
            num[index] = sc.nextInt();
        }
        for (int index = 0; index < size; index++) {
            if (index % 2 == 0) {
                sum = sum + num[index];
            } else {
                sumO = sumO + num[index];
            }
        }
        System.out.println("The sum of even values is " + sum);
        System.out.println("The sum of odd values is " + sumO);
    }
}
