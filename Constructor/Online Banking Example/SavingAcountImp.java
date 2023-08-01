import java.util.Scanner;

public class SavingAcountImp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long accountnumber = s.nextLong();
        String name = s.next();
        String status = s.next();

        SavingAccount sv = new SavingAccount(accountnumber, name, status);
        System.out.println(sv.generateAcountNumber());
        int i = 0;
        do {
            System.out.println("type 1 for retrieve balance");
            System.out.println("type 2 for debit balance");
            System.out.println("type 3 for credit balance");
            System.out.println("type 4 for depositcash");
            System.out.println("type 5 for fundtransfer");
            System.out.println("Enter your choice..............");

            int type = s.nextInt();
            switch (type) {
                case 1 -> {
                    System.out.println(sv.balance);
                }

                case 2 -> {
                    int amount = s.nextInt();
                    System.out.println(sv.debitcash(amount));
                }

                case 3 -> {
                    int amount = s.nextInt();
                    System.out.println(sv.creditcash(amount));
                } // break;
                case 4 -> {
                    int amount = s.nextInt();
                    System.out.println(sv.depositcash(amount));
                } // break;
                case 5 -> {
                    int amount = s.nextInt();

                    System.out.println(sv.fundtransfer(amount));
                } // break;
                default -> System.out.println("wrong choice");
            }
            System.out.println("to exit type 1 else type 0");
            int choice = s.nextInt();
            if (choice == 1)
                i = 1;
        } while (i == 0);
    }
}