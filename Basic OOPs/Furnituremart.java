import java.util.Scanner;

public class Furnituremart {
	public void displayusetype() {
		System.out.println("Choose the item type on the basis of Use :");
		System.out.println("1. Indoor Use");
		System.out.println("2. Outdoor Use");
	}

	public void displaytypes() {
		System.out.println("Choose The item from the given list :");
		System.out.println("1. Tables");
		System.out.println("2. Chains");
		System.out.println("3. Cupboards");
		System.out.println("3. Stools");
	}

	public void displaycolors() {
		System.out.println("Choose the colout of Your Item from the colours given below  :");
		System.out.println("1.Red");
		System.out.println("2.Green");
		System.out.println("3.Yellow");
	}

	public void displaygrades() {
		System.out.println("Choose the material grade of your item :");
		System.out.println("1. Grade 1");
		System.out.println("2. Grade 2");
		System.out.println("3. Grade 3");
	}

	public String discountonitem(String itemtype) {
		if (itemtype == "Indoor Use") {
			return "No discount on Indoor use items ";
		}
		return "5% discount is applicable on Outdoor items ";
	}

	public void displayordersummary(String itemusetype, String itemtype, String color, String grade, String discount) {
		System.out.println("Order Summary : ");
		System.out.println("The item use type is :           " + itemusetype);
		System.out.println("The item which is purchased is : " + itemtype);
		System.out.println("The item grade is :              " + grade);
		System.out.println("The item color is :              " + color);
		System.out.println("The discount on the item :       " + discount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Furnituremart obj = new Furnituremart();
		obj.displayusetype();
		String itemusetype = sc.nextLine();
		obj.displaytypes();
		String itemtype = sc.nextLine();
		obj.displaycolors();
		String color = sc.nextLine();
		obj.displaygrades();
		String grades = sc.nextLine();
		String discount = obj.discountonitem(itemusetype);
		obj.displayordersummary(itemusetype, itemtype, color, grades, discount);
		sc.close();

	}
}