package fa.training.services;

import fa.training.entities.Book;
import fa.training.entities.Magazine;

import java.util.List;

public interface ILibraryServices {
    //add a new book.
    void addBook();

    //add a new magazine
    void addMagazine();

    //display the list of all books and magazines that have the same publication year and publisher
    void displayPublications();

    //add an author to a specific book
    void addAuthorToBook();

    void display10MagazineByVolume();

    void searchBook();

