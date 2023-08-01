import java.util.Random;
import java.util.Scanner;

public class Bank_Account {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    // Instance variable non-static balance 2 is for another person balance
    int balance = 10000;
    int amount = 0;
    int balace2 = 1000;

    public void displaybank() {
        System.out.println("Welcome to HDFC Bank");
        System.out.println("For Sign Up press 1 \nFor Sign In press 2\nFor Exit Press 0");
    }

    public void newUser() {
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

    public void exitingUser() {
        System.out.print("Enter your username");
        String username = sc.next();
        System.out.print("Enter password");
        String password = sc.next();
        if (username.equals("gaurav") && password.equals("gaurav")) {
            System.out.println("Welcome Back! Gaurav");
            System.out.println("For transaction");
            System.out.println("1. Balance Check\n2. deposit Cash\n3. withdraw cash\n4. Transfer Fund");
            int tr = sc.nextInt();
            switch (tr) {
                // If you want to check balance and initial value of balance is 10000
                case 1 -> {
                    System.out.println("Your Balance is => " + this.balance);
                }
                // Amount to be deposit
                case 2 -> {
                    System.out.print("Enter the amount you wanted to deposit : ");
                    amount = sc.nextInt();
                    this.balance = amount + this.balance;
                    System.out.println(this.balance);
                }
                // Amount to withdraw
                case 3 -> {
                    System.out.print("Enter the Amount you wanted to withdraw : ");
                    amount = sc.nextInt();
                    if (this.balance >= 500) {
                        this.balance = this.balance - amount;
                        System.out.println(this.balance);
                    } else {
                        System.out.println("Your balance is less than 500");
                        System.out.println("Your balance is : " + this.balance);
                    }
                }
                // Transfer amount to someone
                case 4 -> {
                    System.out.println("Enter Username of your whom you wanted to transfer ");
                    String TrUser = sc.next();
                    System.out.print("Enter the amount you wanted to transfer ");
                    amount = sc.nextInt();
                    if (this.balance > 500) {
                        this.balance = this.balance - amount;
                        this.balace2 = this.balace2 + amount;
                        System.out.println(TrUser + " have " + this.balace2);
                        System.out.println(this.balance);
                    } else {
                        System.out.println("Your account balance is low. Can't Transfer");
                    }

                }
                default -> {
                    System.out.println("Enter right Input");
                }
            }

        } else {
            System.out.println("Invalid UserName or PassWord");
        }
    }

    public static void main(String[] args) {
        Bank_Account obj = new Bank_Account();
        Scanner sc = new Scanner(System.in);
        obj.displaybank();
        // Take input from User
        int in = sc.nextInt();
        // Run Loop for Sign Up and Sign In
        while (in > 0) {
            if (in == 1) {
                obj.newUser();
            } else if (in == 2) {
                obj.exitingUser();
            } else {
                System.out.println("Enter correct input");
            }
            obj.displaybank();
            in = sc.nextInt();
        }
    }
}