import java.util.Scanner;

public class Message {
    public void display(int num) {
        System.out.println("Thanks for entered a number " + num);
    }

    public void display(String s) {
        System.out.println("Thank for enter string " + s);
    }

    public static void main(String[] args) {
        Message msg = new Message();
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        String str = sc.next();
        msg.display(var);
        msg.display(str);
    }

}
