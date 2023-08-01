public class First {
    public static void main(String[] args) {
        String pass = "password@123";
        String username = "James";
        /*
         * char num = 'A';
         * String a = pass + num;
         * System.out.println(a);
         * String msg = pass.concat(username);
         * System.out.println(msg);
         */

        String b = pass.formatted(username);
        System.out.println(b);

    }
}