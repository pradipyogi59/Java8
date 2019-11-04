package CoreConcept.Object.Aggregation;


import java.util.ArrayList;
import java.util.List;

class Book
{

    public String title;
    public String author;

    Book(String title, String author)
    {

        this.title = title;
        this.author = author;
    }
}

class Library
{

    // reference to refer to list of books.
    private final List<Book> books;

    Library (List<Book> books)
    {
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary(){

        return books;
    }

}

public class basic {

    public static void main(String[] args) {

        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        List<Book> listOfBook=new ArrayList<>();
        listOfBook.add(b1);
        listOfBook.add(b2);
        listOfBook.add(b3);

        Library li1=new Library ( listOfBook );

        System.out.println (li1.getTotalBooksInLibrary ().get ( 0 ).title );

        li1=null;

        System.out.println (b1.title );

    }
}
