package fa.training.services;

import fa.training.entities.Book;

import java.util.List;

public interface IBookServices {
    void addAuthorToBook(String isbn, String author);
    Book searchBookByIsbn(String isbn);
    List<Book> searchBookByAuthor(String author);
    List<Book> searchBookByPublisher(String publisher);
}
