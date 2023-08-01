public class HollowPa {
    public static void main(String[] args) {
        /*
         * * * * * *
         * * *
         * * *
         * * * * * *
         * 
         * row line star space
         * 4 1 5 0
         * 4 2 2 7
         * 4 3 2 7
         * 4 4 5 0
         */
        int row = 4;
        for (int line = 1; line <= 2; line++) {
            System.out.println("");
            int star = 5;
            for (int j = 1; j <= 5; j++) {
                System.out.print(" *");
            }
        }
    }
}
