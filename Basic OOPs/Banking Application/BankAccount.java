import java.util.Scanner;

public class BankAccount{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);

        Account account=new Account();
        Account source=new Account();
        Account target=new Account();
        SavingAccount savingAccount=new SavingAccount();
        byte n5=1;
        while(n5!=0) {
            System.out.println("");
            System.out.println("Do you have an account in our Bank?  1 to yes || 2 to no");
            byte n = t.nextByte();
            //System.out.println(n);

            if (n == 1) {
                System.out.println("1 to SavingAccount || 2 to PayAccount");
                byte n3 = t.nextByte();
                System.out.println("Enter Your 12-Digit  account Number :");
                source.account = t.nextLong();
                //System.out.println(source.account);
                if (source.account < 99999999999L || source.account >= 999999999999L) {
                    System.out.println("account Number should consist of 12 Digit  Enter Again");
                    source.account = t.nextLong();
                }
                System.out.println("Enter Your Name :");
                source.name = t.next();
                //System.out.println(source.name);
                //System.out.println("Enter Your Balance :");
                //source.balance=t.nextDouble();
                //System.out.println(source.balance);
                System.out.println("Enter Your account Status 1 for Active and  0 for Non-Actice:");
                int st = t.nextInt();
                if (st == 1) {
                    source.status = "Active";
                } else {
                    source.status = "Non-Active";
                }
                //System.out.println(source.status);

                System.out.println("Choose the below Options :");
                System.out.println("1 - Withdraw Cash");
                System.out.println("2 - Check Balance");
                System.out.println("3 - Deposit Cash");
                System.out.println("4 - Transfer Funds");
                if (n3 == 1) {
                    System.out.println("5 - Interest");
                }
                byte option = t.nextByte();
                //System.out.println(option);

                if (option == 1) {
                    System.out.println("Enter withdraw Amount :");
                    account.amount = t.nextDouble();
                    //System.out.println(account.amount);
                    System.out.println(account.withdraw(account.amount, source));
                } else if (option == 2) {
                    account.checkBalance(source);
                } else if (option == 3) {
                    System.out.println("Enter Deposit Amount :");
                    account.amount = t.nextDouble();
                    //System.out.println(account.amount);
                    System.out.println(account.deposit(account.amount, source));
                } else if (option == 4) {
                    System.out.println("Enter account Number for Transferring :");
                    target.account = t.nextLong();
                    //System.out.println(target.account);
                    if (target.account < 99999999999L || target.account >= 999999999999L) {
                        System.out.println("account Number should consist of 12 Digit  Enter Again");
                        target.account = t.nextLong();
                    }
                    System.out.println("Enter Transfer Amount :");
                    account.amount = t.nextDouble();
                    //System.out.println(account.amount);
                    System.out.println(account.transferrFund(account.amount, source, target));
                } else if (option == 5) {
                    System.out.println("Your Interest Amount: " + savingAccount.getInterest(source));
                } else
                    System.out.println("Enter a valid option");

                System.out.println("Do you want to continue? 1 for YES or 0 for No");
                n5 = t.nextByte();
            } else if (n == 2) {
                System.out.println("Do you wish to Open an account? 1 for Yes || 0 for No ");
                byte n2 = t.nextByte();
                //System.out.println(n2);
                if (n2 == 1) {
                    System.out.println("1 to SavingAccount || 2 to PayAccount");
                    byte n4 = t.nextByte();
                    System.out.println("Enter Your Name :");
                    source.name = t.next();
                    System.out.println("Enter Your Address :");
                    String address = t.next();
                    System.out.println("Enter Your Phone :");
                    long pnum = t.nextLong();
                    System.out.println("Enter Your Email :");
                    String email = t.next();
                    System.out.println("Enter Your Balance :");
                    source.balance = t.nextDouble();
                    //System.out.println(source.name);
                    source.account = account.autoGeneratednumber();
                    System.out.println("-------------- Congratulation " + source.name + " ----------------- ");

                    if (n4 == 1) {
                        System.out.println("***************** SavingAccount Details **************** ");
                    }
                    if (n4 == 2) {
                        System.out.println("***************** PayAccount Details **************** ");
                    }
                    System.out.println("");
                    System.out.println("Your account Number   : " + source.account);
                    System.out.println("account Holder Name   : " + source.name);
                    System.out.println("Phone Number          : " + pnum);
                    System.out.println("Email                 : " + email);

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Do you want to continue? 1 for YES or 0 for No");
                    n5 = t.nextByte();

                }
            }
        }

    }

}
