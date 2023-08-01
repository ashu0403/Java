import java.util.Scanner;

public class MultiDAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] mark = new char[4][3];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter value for row " + row + "Enter value for COl " + col);
                mark[row][col] = sc.nextLine().charAt(0);
                System.out.print(mark[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
