public class SquareP {
    /*
     * row line star space
     * 4 1 4 0
     * 4 2 4
     * 4 3 4
     * 4 4 4
     * 
     * ****
     * ****
     * ****
     * ****
     */
    public static void main(String[] args) {
        int row = 4;

        for (int line = 1; line <= row; line++) {

            System.out.println();
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
        }
    }
}
