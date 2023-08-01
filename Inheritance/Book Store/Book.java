
public class Book extends Author {
    private int ISBN;
    private float price;
    private String description;
    private String title;
    // Inherit the properties of Author Class
    Author author;

    public Book(Author author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Displaying the properties
    public void displayDetails() {
        System.out.println("-----------  Book Details ----------");
        System.out.println(
                "ISBN No.   |         Title        |   Author-Name   |   A-Pen-Name   |   Description   |    Price");
        System.out.println(getISBN() + "        |  " + getTitle() + "  |  " + author.getAuthorName() + "  |      "
                + author.getAuthorPenName() + "       |    " + getDescription() + "    |  " + getPrice());
    }
    // Calculating the discount for Fiction book

    public float calculateDiscount() {
        if (getDescription().equals("fiction")) {
            return getPrice() * .75f;
        }
        return getPrice();
    }
}
