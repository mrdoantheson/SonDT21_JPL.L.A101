package fa.training.services;

import fa.training.entities.Book;
import fa.training.entities.Magazine;
import fa.training.entities.Publication;

import java.util.*;

/**
 * @author SonDT21
 *
 * version 1.0
 */
public class LibraryServices implements ILibraryServices {
    Scanner scanner = new Scanner(System.in);
    List<Magazine> magazineList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();
    List <Publication> publications = new ArrayList<>();

    /**
     * Create a new book
     */
    @Override
    public void addBook() {
        Book book = new Book();
        book.inputData(scanner);
        bookList.add(book);
        publications.add(book);
    }

    /**
     * Create a new magazine
     */
    @Override
    public void addMagazine() {
        Magazine magazine = new Magazine();
        magazine.inputData(scanner);
        magazineList.add(magazine);
        publications.add(magazine);
    }

    /**
     * Display all books and magazines that have the same publication year and publisher
     */
    @Override
    public void displayPublications() {
        System.out.println("---- Display the list of all books and magazines that have the same publication year and publisher ----");

        scanner = new Scanner(System.in);
        System.out.println("Enter the publisher: ");
        String publisher = scanner.nextLine();

        System.out.println("Enter the publication year: ");
        int publisherYear = scanner.nextInt();

        for (Publication publication : publications) {
            if (publication.getPublicationYear() == publisherYear && publication.getPublisher().equals(publisher)) {
                publication.display();
            }
        }
    }

    /**
     * Add an author to a specific book
     */
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

    /**
     * Display the list of top 10 magazines which have the largest volume
     */
    @Override
    public void display10MagazineByVolume() {
        if (magazineList.isEmpty()) {
            System.out.println("No magazine found.");
        } else {
            System.out.println("---- Display 10 magazines by volume ----");
            magazineList.sort(Comparator.comparing(Magazine::getVolumn));
            for (Magazine magazines : magazineList.subList(0, Math.min(magazineList.size(), 10))) {
                magazines.display();
            }
        }
    }

    /**
     * Search book by isbn, author, publisher
     */
    @Override
    public void searchBook() {
        System.out.println("---- Search book ----");
        System.out.print("Search book by (1: ISBN, 2: Author, 3: Publisher): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                scanner = new Scanner(System.in);
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
            default -> System.out.println("Invalid choice, please try again.");
        }
    }


}
