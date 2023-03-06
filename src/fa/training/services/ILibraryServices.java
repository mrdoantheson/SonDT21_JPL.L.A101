package fa.training.services;

import fa.training.entities.Book;
import fa.training.entities.Magazine;

import java.util.List;

public interface ILibraryServices {
    void addBook();

    void addMagazine();

    //display the list of all books and magazines that have the same publication year and publisher
    void displayPublications();

    void addAuthorToBook(String isbn, String author);

    Book searchBookByIsbn(String isbn);

    List<Book> searchBookByAuthor(String author);

    List<Magazine> getTopMagazines();

    List<Book> searchBookByPublisher(String publisher);
}

