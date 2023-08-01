import java.util.HashMap;
import java.util.Scanner;

public class Electronic {
    static String product;
    static int price;
    static int CustomerID;

    public static void main(String[] args) {
        HashMap map = new HashMap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer ID: ");
        CustomerID = sc.nextInt();
        System.out.print("Enter the product name: ");
        product = sc.next();
        System.out.print("Enter the price: ");
        price = sc.nextInt();
        map.put(CustomerID, price);
        System.out.println(map.get(CustomerID));
        System.out.println(map);

    }
}
