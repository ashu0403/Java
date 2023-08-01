import java.util.Scanner;

public class SavingAccount {
    public long accountnumber = 0;
    public String name = "";
    public int balance = 10000;
    public String status = "";
    public int amount = 0;

    public SavingAccount(long accountnumber, String name, String status) {
        this.accountnumber = accountnumber;
        this.name = name;
        this.status = status;
        int amount = 0;

        System.out.println("accountnumber = " + accountnumber);
        System.out.println("name  " + name);
        System.out.println(" balance " + balance);
        System.out.println(" status " + status);
    }

    long generateAcountNumber() {
        return (long) (Math.random() * (999999999999L - 100000000000L + 1) + 100000000000L);
    }

    public int withdrawcash(int amount) {
        this.amount = amount;
        System.out.println("enter amount you want to withdraw " + amount);
        int balanceafterwithdrawcash = balance - amount;
        System.out.println("balaceafternwithdrawcash " + balanceafterwithdrawcash);
        return balanceafterwithdrawcash;
    }

    public int depositcash(int amount) {
        this.amount = amount;
        System.out.println("enter amount you want to deposit " + amount);
        int balanceafterdepositcash = balance + amount;
        balance = balanceafterdepositcash;
        System.out.println("balanceafterdepositcash " + balanceafterdepositcash);
        return balanceafterdepositcash;
    }

    public int fundtransfer(int amount) {
        this.amount = amount;
        System.out.println("enter amount you want to transfer " + amount);
        int balanceafterfundtransfer = balance - amount;
        balance = balanceafterfundtransfer;
        System.out.println("balanceafterfundtransfer " + balanceafterfundtransfer);
        return balanceafterfundtransfer;
    }

    public int debitcash(int amount) {
        this.amount = amount;
        System.out.println("enter amount you want to debit " + amount);
        int balanceafterdebit = balance + amount;
        balance = balanceafterdebit;
        System.out.println("balanceafterdebit " + balanceafterdebit);
        return balanceafterdebit;
    }

    public int creditcash(int amount) {
        this.amount = amount;
        System.out.println("enter amount you want to cedit " + amount);
        int balanceaftercredit = balance - amount;
        balance = balanceaftercredit;
        return balanceaftercredit;
    }
}