import java.util.Scanner;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        /*
         * //declare array without size
         * int score[];
         * int[] scoreofplayer;
         * float [][] var;
         * //declar an array with size
         * int score[]=new int[6];
         * //datatype var[]=new datatype[size];
         * float v[][]=new float[4][5];
         */
        String age[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            age[index] = sc.nextLine();
        }

        for (int index = 0; index < 5; index++) {

            System.out.print(" " + age[index]);
        }
        System.out.println(Arrays.toString(age));
    }
}