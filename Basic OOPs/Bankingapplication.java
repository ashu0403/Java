import java.util.Scanner;
import java.util.Random;

public class Bankingapplication {
    Bankingapplication obj = new Bankingapplication();

    int bankbalance;

    public void displaydetails() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("            Welcome to HDFC Bank");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Choose any one from the choice :");
        System.out.println(" Enter 1 if already have a account ");
        System.out.println("Enter 2 if Want's to open the New Account");
    }

    public void withdrawcash(int withdrawn) {
        bankbalance = bankbalance - withdrawn;

    }

    public void depositcash(int deposit) {
        bankbalance = bankbalance + deposit;
    }

    public void checkbalance() {
        System.out.println("The bank balance of your account is " + obj.bankbalance);
    }

    public void bankingservicedisplay() {
        System.out.println(" Choose the transaction types : ");
        System.out.println("1. Withdraw cash ");
        System.out.println("2. Deposit cash ");
        System.out.println("3. Transfer funds");
        System.out.println("4. Bank balance");

    }

    public void bankingservice() {
        int z;
        do {

            obj.bankingservicedisplay();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("Input the amount of cash you want to withdraw");
                int b = sc.nextInt();
                obj.withdrawcash(a);
                System.out.println("The bank balance after withdrawing  " + b + " is : " + obj.bankbalance);
            } else if (a == 2) {
                System.out.println("Input the amount you wanted to deposit in your bank account ");
                int c = sc.nextInt();
                obj.depositcash(c);
                System.out.println("The bank balance after adding +" + c + " is : " + obj.bankbalance);

            } else if (a == 3) {
                System.out.println("Input the amount you wanted to transfer to other account ");
                int d = sc.nextInt();
                System.out.println("Input the account number of payee :");
                long e = sc.nextLong();
                System.out.println("Input the name of account holder");
                String name = sc.nextLine();
                obj.withdrawcash(d);
                System.out.println("Transfer funds Summary");
                System.out.println("The payee accounts number :" + e);
                System.out.println("The payee name :" + name);
                System.out.println("The bank balance after transfering the funds : " + obj.bankbalance);

            } else if (a == 4) {
                obj.checkbalance();
            } else {
                System.out.println("Input the valid number :");
            }
            System.out.println("Input the any number to continue further transactions or 0 to exit ");
            z = sc.nextInt();

        } while (z != 0);
    }

    public String accountype() {
        System.out.println("Select the account type from the given below : ");
        System.out.println("1. Saving Account");
        System.out.println("2. Current account");
        System.out.println("3. Ultra Savings account");
        System.out.println("Choose 1,2,3 from the above as per the account ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            return "Savings account";
        } else if (a == 2) {
            return "Current account";
        } else if (a == 3) {
            return "Ultra savings account";
        } else {
            System.out.println("Choose the valid account");
            obj.accountype();

        }

        return " ";
    }

    public String eligbleforaccount(int age) {
        String accountype = " ";
        if (age > 18) {
            System.out.println("Eligible for account opening ");
            accountype = obj.accountype();
        }

        else {
            System.out.println("Age should be greater than 18");
        }
        return accountype;
    }

    public void generateaccountnumber() {
        Random r = new Random();
        long a = r.nextLong(100000000000L, 999999999999L);
        System.out.println("Your account number is :" + a);

    }

    public void newaccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the age");
        int a = sc.nextInt();
        String accounttype = obj.eligbleforaccount(a);
        if (accounttype == "Savings account") {
            System.out.println("Input your name :");
            String names = sc.nextLine();
            obj.generateaccountnumber();
            System.out.println("Your name : " + names);
            System.out.println("Your age :" + a);
            System.out.println("Account type :" + accounttype);
        } else {
            System.out.print("only savings account are allowed to open ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bankingapplication m1 = new Bankingapplication();
        m1.displaydetails();
        int a = sc.nextInt();
        if (a == 1) {
            m1.newaccount();
        } else {
            m1.bankingservice();
        }
        sc.close();
    }

}
