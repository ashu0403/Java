class PizzaOrder {
    public static void main(String[] args) {
        String customerName = "Gary";
        String customerEmail = "gary@123.com";
        long phoneNo = 412312345L;
        String address = "20, Marble Drive, Eville";
        int noOfPizzasOrdered = 5;
        float pizzaPrice = 12.5f;
        char pizzaSize = 'M';
        byte noOfGarlicBreadOrdered = 3;
        float garlicBreadPrice = 5.99f;
        short noOfBeveragesOrdered = 3;
        float beveragePrice = 1.99f;
        float fivePizza = pizzaPrice * 5;
        float threeGarlic = garlicBreadPrice * 3;
        float threeBeverages = beveragePrice * 3;
        float totalBill = fivePizza + threeGarlic + threeBeverages;
        float amountPaid = (totalBill * 10) / 100;
        System.out.println("-------------");
        System.out.println("Customer Details");
        System.out.println("--------------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Phone Number : " + phoneNo);
        System.out.println("Customer Email : " + customerEmail);
        System.out.println("Customer Address : " + address);
        System.out.println("");
        System.out.println("");
        System.out.println("-------------");
        System.out.println("Order Summary");
        System.out.println("-------------");
        System.out.println("");
        System.out.println("Sr No.  ItemName  ItemQuantity  $Price/Unit  $TotalPrice");
        System.out.println("--------------------------------------------------------");
        System.out.println("1  " + " Pizza          " + "5" + "            " + pizzaPrice + "           " + fivePizza);
        System.out.println(
                "2  " + " Garlic Bread   " + "3" + "            " + garlicBreadPrice + "           " + threeGarlic);
        System.out.println(
                "3  " + " Beverages      " + "3" + "            " + beveragePrice + "           " + threeBeverages);
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Bill Amount: $" + totalBill);
        System.out.println("Discount offered : 10%");
        System.out.println("Amount to be paid: $" + (totalBill - amountPaid));
        System.out.println("------------------Thank You---------------------------");

    }

}
