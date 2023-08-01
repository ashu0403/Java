import java.util.Scanner;

public class ReverseArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size => ");
        int size = sc.nextInt();
        int[] num = new int[size];
        // long startTime = System.currentTimeMillis();

        for (int index = 0; index < size; index++) {
            num[index] = sc.nextInt();
        }
        ReverseArrayDemo rad = new ReverseArrayDemo();
        int[] output = rad.reverseArray(num, size);
        for (int k = 0; k < size; k++) {
            System.out.println(output[k]);
        }
        // long finishTime = System.currentTimeMillis();
        // System.out.println("That took: " + (finishTime - startTime) + " ms");
    }

    public int[] reverseArray(int[] num, int size) {
        int[] arr = new int[size];
        int i = 0;
        int index;
        for (index = num.length - 1; index >= 0; index--, i++) {

            arr[i] = num[index];
        }
        return arr;

    }
}