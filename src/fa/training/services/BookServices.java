package fa.training.services;

import fa.training.entities.Book;

import java.util.List;

public class BookServices implements IBookServices{
    @Override
    public void addAuthorToBook(String isbn, String author) {

    }

    @Override
    public Book searchBookByIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Book> searchBookByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> searchBookByPublisher(String publisher) {
        return null;
    }
}
