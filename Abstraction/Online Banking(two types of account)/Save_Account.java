import java.util.*;

public class Save_Account {
    public void randomAcc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name => ");
        String name = sc.next();
        System.out.print("Enter your age => ");
        int age = sc.nextInt();
        System.out.println("Your Name is : " + name);
        System.out.println("Your age is : " + age);
        long min = 100_000_000_000l;
        long max = 999_999_999_999l;
        long b = (long) (Math.random() * (max - min + 1) + min);
        System.out.println("Your Account Number is => " + b);
    }
    public double calculateInterest(int balance, double interest){
        return (balance * interest)/100;
    }

}