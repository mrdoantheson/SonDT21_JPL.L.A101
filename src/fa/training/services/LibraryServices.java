package fa.training.services;

import fa.training.entities.Book;
import fa.training.entities.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServices implements ILibraryServices {
    Scanner scanner = new Scanner(System.in);
    List<Magazine> magazineList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();

    @Override
    public void addBook() {
        Book book = new Book();
        book.inputData(scanner);
        bookList.add(book);
    }

    @Override
    public void addMagazine() {
        Magazine magazine = new Magazine();
        magazine.inputData(scanner);
        magazineList.add(magazine);
    }

    @Override
    public void displayPublications() {
        for (Book book : bookList) {
            for (Magazine magazine : magazineList) {
                if (book.getPublicationYear() == magazine.getPublicationYear() && book.getPublisher().equals(magazine.getPublisher())) {
                    book.display();
                    magazine.display();
                }
            }
        }

    }

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
    public List<Magazine> getTopMagazines() {
        return null;
    }

    @Override
    public List<Book> searchBookByPublisher(String publisher) {
        return null;
    }
}
