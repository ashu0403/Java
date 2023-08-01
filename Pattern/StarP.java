public class StarP {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 1; i <= 4; i++) {// 1
            int star = row - i + 1;// 4
            for (int j = 1; j <= star; j++) {// 1
                System.out.print("*");//

            }
            System.out.println("");//
        }
    }
}
