import java.util.Random;
import java.util.Scanner;

//Declare and initialize objects in the SavingAccount class
//Retrieve the account balance
//Debit cash
//Credit cash
public class SavingAccount {

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

    public void exitingUser(String username, String password) {

        if (username.equals("root") && password.equals("toor")) {
            System.out.println("Welcome Back! Gaurav");
            System.out.println("For transaction");
            System.out.println("1. Balance Check\n2. deposit Cash\n3. withdraw cash\n4. Transfer Fund");
            int tr = sc.nextInt();
            switch (tr) {
                // If you want to check balance and initial value of balance is 10000
                case 1 -> {
                    System.out.println("Your Balance is => " + this.balance);
                }
                // Amount to be Credit
                case 2 -> {
                    System.out.print("Enter the amount you wanted to deposit : ");
                    amount = sc.nextInt();
                    this.balance = amount + this.balance;
                    System.out.println("Your balance is : " + this.balance);
                }
                // Amount to Debit
                case 3 -> {
                    System.out.print("Enter the Amount you wanted to withdraw : ");
                    amount = sc.nextInt();
                    if (this.balance >= 500) {
                        this.balance = this.balance - amount;
                        System.out.println("Your balance is : " + this.balance);
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
                        System.out.println("Your balance is : " + this.balance);
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

    SavingAccount() {
        Scanner sc = new Scanner(System.in);
        // Take input from User
        displaybank();
        int in = sc.nextInt();
        while (in > 0) {
            displaybank();
            if (in == 1) {
                // Non Argument Constructor for new User
                newUser();
            } else if (in == 2) {
                // Parameterised Constructor for Exiting user
                exitingUser("root", "toor");
            } else {
                System.out.println("Enter correct input");
            }
            displaybank();
            in = sc.nextInt();
        }
    }
}
