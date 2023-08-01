public class StarPrint {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        String str1[] = { "Hello", "World", "Welcome" };
        String str2[] = { "World", "class", "test" };
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                System.out.print(str1[i] + " " + str2[i] + " ");
            }
            System.out.println();
        }
    }
}