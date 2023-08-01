import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Gaurav";
        String b = "cccccc";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.length());
        System.out.println(a.trim().concat(b));
        System.out.println(a.toUpperCase());
        System.out.println(b.replace("cc", "b"));
        System.out.println(b.compareTo(a));
        System.out.println(a.lastIndexOf(""));
    }

}
