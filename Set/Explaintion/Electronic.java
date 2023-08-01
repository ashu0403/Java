import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Electronic {
	String customerid;
	String product;
	int price;

	public Electronic(String customerid, String product, int price) {
		this.customerid = customerid;
		this.price = price;
		this.product = product;
	}

	public static void main(String args[]) {

		HashMap<String, Electronic> map1 = new HashMap();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Input the customer id : ");
		// String customerid = sc.next();
		// System.out.println("Inout the price of the product : ");
		// int price = sc.nextInt();
		// System.out.println("Input the Product : ");
		// String product = sc.next();
		// Electronic e1 = new Electronic(customerid, product, price);
		Electronic e2 = new Electronic("ab2", "chair", 700);
		Electronic e3 = new Electronic("ab3", "table", 800);
		// map1.put(customerid, e1);
		map1.put("1", e2);
		map1.put("2", e3);

		for (Map.Entry<String, Electronic> temp : map1.entrySet()) {
			System.out
					.println(temp.getValue().customerid + " " + temp.getValue().product + " " + temp.getValue().price
							+ " " + temp.getKey());
		}
	}
}