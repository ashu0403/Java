package Library;


public class Book
{
    String ISBN;
    String title;
    int year;
    Author author;

    public Book(String ISBN,String title,int year,Author author)
    {

        this.ISBN=ISBN;
        this.title=title;
        this.year=year;
        this.author=author;
    }

    public void displaybookdetail()
    {

        System.out.println(this.ISBN+"    "+this.title+"  "+this.year);
        System.out.println(author.authorName+"      "+author.authorPenName+"        "+ author.year );
    }
}