public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book(new Author());
        book.setISBN(1354);
        book.setTitle("Great Power Politics");
        book.setDescription("fiction");
        book.setPrice(1250);
        book.author.setAuthorName("Jhon Mehershimer");
        book.author.setAuthorPenName("Machiavelli");

        book.displayDetails();
        System.out.println("Discounted Price: $" + book.calculateDiscount());

    }
}
