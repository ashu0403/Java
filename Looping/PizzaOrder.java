import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name ");
        String name = s.nextLine();
        System.out.print("Enter the email ");
        String email = s.nextLine();
        System.out.print("Enter the address ");
        String address = s.nextLine();
        System.out.print("Enter the Phone No. ");
        Long phoneNo = s.nextLong();
        System.out.print("Enter the No of Pizza Ordered ");
        int noOfPizzasOrdered = s.nextInt();
        System.out.print("Enter the Price of Pizza ");
        float priceOfPizza = s.nextFloat();
        System.out.print("Enter the Pizza Siza ");
        char pizzaSize = s.next().charAt(0);
        System.out.print("No of Garlic Bread Ordered ");
        int noOfGarlicBreadOrdered = s.nextInt();
        System.out.print("Enter Price of Garlic Bread ");
        float priceOfGarlicBread = s.nextFloat();
        System.out.print("Enter the No of Beverages Ordered ");
        int noOfBeveragesOrdered = s.nextInt();
        System.out.print("Enter the Price of Beverage ");
        float priceOfBeverage = s.nextFloat();
        float totalbill = 0, a = 0, b = 0, c = 0;
        int anotherorder;
        System.out.println("SL NO Item Category ");
        System.out.println("----------------------");
        do {
            System.out.println("1) Pizza ");
            System.out.println("2) Garlic Bread");
            System.out.println("3) Beverages");
            System.out.println("Enter 1 for Pizza , 2 for Garlic Breadand 3 for Beverages");
            int fooditem = s.nextInt();
            if (fooditem == 1) {
                System.out.println(fooditem);
                System.out.println("Please enter the number of pizzas you want to order :");
                System.out.println(noOfPizzasOrdered);
                c = noOfPizzasOrdered * priceOfPizza;
                System.out.print("Your total pizza bill : $" + c);
            } else if (fooditem == 2) {
                System.out.println(fooditem);
                System.out.println("Please enter the number of garlic bread you want to order :");
                System.out.println(noOfGarlicBreadOrdered);
                b = noOfGarlicBreadOrdered * priceOfGarlicBread;
                System.out.println("Your total garlic bread bill : $" + b);
            } else if (fooditem == 3) {
                System.out.println(fooditem);
                System.out.println("Please enter the number of beverages you want to order :");
                System.out.println(noOfBeveragesOrdered);
                a = noOfBeveragesOrdered * priceOfBeverage;
                System.out.println("Your total beverages bill : $" + a);
            } else {
                System.out.println("input the item according to the item code");
            }

            float bill = a + b + c;
            totalbill = totalbill + bill;

            System.out.println("Do you want to place another order then enter 1 to continue or 0 to exit");
            anotherorder = s.nextInt();
        } while (anotherorder != 0);

        if (totalbill > 50) {
            System.out.println("The total bill amount is : $" + totalbill);
            System.out.println("After the discounted bill amount : $" + (totalbill - totalbill * 0.1));
        } else {
            System.out.println("The total bill amount is : $" + totalbill);
            System.out.println("No discount provided since bill amount is less than $50");
        }
    }
}
