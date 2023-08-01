import java.util.Scanner;

public class MaxAge {
    public static void main(String[] args) {
        System.out.print("How many values you want to enter => ");
        MaxAge ae = new MaxAge();
        System.out.println("Max Age is => " + ae.getMaxAge());

    }

    public int getMaxAge() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int index = 0; index < size; index++) {
            num[index] = sc.nextInt();
        }
        int max = num[0];
        for (int row = 0; row < size; row++) {
            if (max < num[row]) {
                max = num[row];
            }
        }
        return max;
    }
}
