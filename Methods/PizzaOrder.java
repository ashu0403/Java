import java.util.Scanner;

public class PizzaOrder {
    static int nooforders = 0;
    static int noofGarlic = 0;
    static int noofBeverage = 0;

    public void displayCustomerDetails(String customerName, String customerEmail, long phoneNo, String address) {
        System.out.println("Customer Details");
        System.out.println("--------------------");
        System.out.println("Name of the Customer is       :" + customerName);
        System.out.println("Email of the Customer is      :" + customerEmail);
        System.out.println("Contact No of the Customer is :" + phoneNo);
        System.out.println("Address of the customer is    :" + address);
        System.out.println("---------------------------------------------");
    }

    public void displayMenu() {
        float regularPizza = 9.99f;
        float mediumPizza = 11.99f;
        float largePizza = 13.99f;
        float garlicBreadPrice = 5.99f;
        float beveragePrice = 1.99f;
        System.out.println("Select the items to order");
        System.out.println("Sl No Item Category");
        System.out.println("---------------------");
        System.out.println("1) Pizza");
        System.out.println("Price of One Regular Pizza :$" + regularPizza);
        System.out.println("Price of One Medium Pizza:$" + mediumPizza);
        System.out.println("Price of One Large Pizza:$" + largePizza);
        System.out.println("2) Garlic Bread");
        System.out.println("Price of One garlic Bread :$" + garlicBreadPrice);
        System.out.println("3) Beverages");
        System.out.println("Price of One Beverages :$" + beveragePrice);

    }

    public float getPriceOfGarlicBread() {
        Scanner sc = new Scanner(System.in);
        float garlicBreadPrice = 5.99f;
        System.out.print("Enter the no of Garlic Bread you want to order ");
        int noOfGarlic = sc.nextInt();
        noofGarlic = noOfGarlic + noofGarlic;
        float newgarlicBreadPrice = noofGarlic * garlicBreadPrice;
        System.out.println("Garlic Bread Total is " + newgarlicBreadPrice);
        return newgarlicBreadPrice;
    }

    public float getPriceOfBeverage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the beverage you want to order ");
        int noOfBeverage = sc.nextInt();
        float beveragePrice = 1.99f;
        noofBeverage = noofBeverage + noOfBeverage;
        float newBeveragePrice = beveragePrice * noOfBeverage;
        System.out.println("Beverage Total is " + newBeveragePrice);
        return newBeveragePrice;
    }

    public float calculatePriceOfPizza(int size) {
        Scanner sc = new Scanner(System.in);
        float priceOfPizza = 0;
        if (size == 1) {
            priceOfPizza = 9.99f;
        } else if (size == 2) {
            priceOfPizza = 11.99f;
        } else if (size == 3) {
            priceOfPizza = 13.99f;
        } else {
            System.out.println("Invalid size, Enter 1, 2 or 3");
            priceOfPizza = 0;
        }
        System.out.println("Price of One Pizza " + priceOfPizza);
        System.out.print("Enter the number of Pizza ");
        int noOfPizza = sc.nextInt();
        nooforders = nooforders + noOfPizza;
        float newPriceOfPizza = nooforders * priceOfPizza;
        System.out.println("Pizza total is " + newPriceOfPizza);
        return newPriceOfPizza;
    }

    public float calculateTotalBill(float newPriceOfPizza, float newBeveragePrice, float newgarlicBreadPrice) {

        float totalBill = newPriceOfPizza + newBeveragePrice + newgarlicBreadPrice;
        System.out.println("Total Bill Amount is " + totalBill);
        return totalBill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter your Name ");
        String customerName = sca.nextLine();
        System.out.print("Enter your Email Address ");
        String customerEmail = sc.next();
        System.out.print("Enter your Phone No. ");
        Long phoneNo = sc.nextLong();
        System.out.print("Enter your Address ");
        String address = sca.nextLine();
        PizzaOrder obj = new PizzaOrder();
        obj.displayMenu();
        float newpizaprice = 0.0f;
        float newGarlic = 0.0f;
        float newBeverage = 0.0f;
        System.out.println("Press 1 for Purchase and Press 0 for when you complete");
        int i = sc.nextInt();
        while (i > 0) {
            System.out.println("Enter 1 for Pizza, 2 for Garlic Bread, 3 for Beverages, 0 for Exit");
            int orderName = sc.nextInt();
            if (orderName == 1) {
                System.out.println("Press 1 for Regular, Press 2 for Medium, Press 3 for Large");
                int size = sc.nextInt();

                newpizaprice = obj.calculatePriceOfPizza(size);
            } else if (orderName == 2) {
                newGarlic = obj.getPriceOfGarlicBread();
            } else if (orderName == 3) {
                newBeverage = obj.getPriceOfBeverage();
            } else if (orderName == 0) {
                i = 0;
            } else {
                System.out.println("Please Put Correct Number");
            }
        }
        obj.displayCustomerDetails(customerName, customerEmail, phoneNo, address);
        System.out.println("Order Details");
        System.out.println("---------------");
        System.out.println("The number of pizzas ordered " + nooforders);
        System.out.println("The number of Garlic Bread Ordered " + noofGarlic);
        System.out.println("The Number of Beverages Ordered " + noofBeverage);
        System.out.println("------------------------------------------------");
        float totalBill = obj.calculateTotalBill(newpizaprice, newGarlic, newBeverage);
        if (totalBill >= 50) {
            float totalDiscountedBill = (totalBill - (totalBill * 10) / 100);
            System.out.println("The Total Bill Amount After Discount " + totalDiscountedBill);
        } else {
            System.out.println("Total Bill Amount is " + totalBill);
        }
    }
}