import java.util.Scanner;

public class SortingAge {

    public int[] getSortedAge(int[] ageArray) {
        int temp = 0;
        for (int i = 0; i < ageArray.length; i++) {
            for (int j = 0; j < ageArray.length - 1; j++) {
                if (ageArray[j] > ageArray[j + 1]) {
                    temp = ageArray[j];
                    ageArray[j] = ageArray[j + 1];
                    ageArray[j + 1] = temp;
                }
            }
        }

        return ageArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of People => ");
        int size = sc.nextInt();
        int[] ageArray = new int[size];
        for (int i = 0; i < size; i++) {
            ageArray[i] = sc.nextInt();
        }
        SortingAge arr = new SortingAge();
        arr.getSortedAge(ageArray);
        for (int i = 0; i < ageArray.length; i++) {
            System.out.print(" " + ageArray[i]);
        }

    }
}