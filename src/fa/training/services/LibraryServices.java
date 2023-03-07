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
    public void addAuthorToBook() {
        System.out.println("---- Add author to book ----");
        System.out.print("Enter book's ISBN: ");
        String isbn = scanner.nextLine();
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("List of authors: " + book.getAuthor());
                System.out.println("Enter author's name: ");
                scanner = new Scanner(System.in);
                String author = scanner.nextLine();
                if (book.getAuthor().equals(author)) {
                    System.out.println("Author already exists!");
                } else {
                    book.setAuthor(author);
                    System.out.println("Author added!");
                }
            }
        }
    }

    @Override
    public void display10MagazineByVolume() {
    }

    @Override
    public void searchBook() {
        System.out.println("---- Search book ----");
        System.out.print("Search book by (1: ISBN, 2: Author, 3: Publisher): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter ISBN to search: ");
                String isbn = scanner.nextLine();
                for (Book book : bookList) {
                    if (book.getIsbn().equals(isbn)) {
                        book.display();
                    }
                }
            }
            case 2 -> {
                System.out.print("Enter author to search: ");
                scanner = new Scanner(System.in);
                String author = scanner.nextLine();
                for (Book book : bookList) {
                    if (book.getAuthor().contains(author)) {
                        book.display();
                    }
                }
            }
            case 3 -> {
                System.out.print("Enter publisher to search:: ");
                String publisher = scanner.nextLine();
                scanner = new Scanner(System.in);
                for (Book book : bookList) {
                    if (book.getPublisher().contains(publisher)) {
                        book.display();
                    }
                }
            }
        }
    }


}
