package Library;

class BookImpl
{
    public static void main(String[] args)
    {
        Author author=new Author("ABC","X",1980);
        Book book=new Book("isbn70900","snow girl",2000,author);
        System.out.println(book.ISBN+"      "+book.title+"      "+book.year  );
        System.out.println(book.author.authorName);

        Book book1=new Book("fb80909","alchemist",2012,author);
    }
}
