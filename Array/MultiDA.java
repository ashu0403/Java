public class MultiDA {
    public static void main(String[] args) {
        /*
         * 98 20 12
         * 12 12 14
         * 25 14 26
         * 15 25 78
         */
        int[][] mark = new int[4][3];
        int[][] marks = { { 98, 20, 12 }, { 12, 12, 14 }, { 25, 14, 26 }, { 15, 25, 78 } };
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }
}
