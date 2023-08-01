import java.util.Scanner;

public class FurnitureItem {

    public void displayColors() {
        System.out.println("select the colour in given list");
        System.out.println("1.red");
        System.out.println("2.blue");
        System.out.println("3.green");
    }

    public void displayGrades() {
        System.out.println("select the grades in given list");
        System.out.println("Grade 1");
        System.out.println("Grade 2");
        System.out.println("Grade 3");
    }

    public void displayfurnituretype() {
        System.out.println("Select the item type you want");
        System.out.println("Indoor furniture");
        System.out.println("Outdoor furniture");
    }

    public void displayItems() {
        System.out.println("1.Tables");
        System.out.println("2.cupboards");
        System.out.println("3.stools");
        System.out.println("4.chairs");
    }

    public String discountOfItem(String furnituretype) {
        String discount = "there is no discount";
        if (furnituretype.equals("outdoor furniture")) {
            discount = "There is  discount on outdoor item";
        } else {
            discount = "there is no 5%discount";
        }
        return discount;
    }

    public void displayorderDetails(String color, String grade, String furnituretype, String itemtype,
            String discount) {
        System.out.println("Order Details");
        System.out.println("Furniture type is :" + furnituretype);
        System.out.println("Item type is :" + itemtype);
        System.out.println("Color of the item is:" + color);
        System.out.println("Grade of the item is:" + grade);
        System.out.println("The discount on the item:" + discount);
    }

    FurnitureItem() {
        Scanner sc = new Scanner(System.in);
        displayfurnituretype();
        String furnituretype = sc.nextLine();
        displayItems();
        String item = sc.nextLine();
        displayColors();
        String color = sc.nextLine();
        displayGrades();
        String grade = sc.nextLine();
        String discount = discountOfItem(furnituretype);
        displayorderDetails(color, grade, furnituretype, discount, item);
    }
}