package com.furniture;

/* A company manufactures plastic furniture in different colors, such as red, blue, and green. The
plastic furniture comes in three grades: grade 1, grade 2, and grade 3. The furniture manufactured is for both
indoor and outdoor use. */

public class FurnitureItem {
    // Final Discount value is 5
    static final int DISCOUNT = 5;
    // Create private variable
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private float price;

    // Create getter and setter for giving variable access modifiers
    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float calculateDiscount() {
        if (getGradeOfFurniture().equals("grade1") && getFurnitureUsage().equals("outdoor")) {
            return getPrice() * (100 - DISCOUNT) / 100;
        }
        return getPrice();
    }

    // Create Non-argument constructor
    public FurnitureItem() {

        setFurnitureCode(101);
        setFurnitureType("table");
        setGradeOfFurniture("grade1");
        setFurnitureUsage("outdoor");
        setPrice(10);
        System.out.println("Discounted Price is $" + calculateDiscount());

    }
}
