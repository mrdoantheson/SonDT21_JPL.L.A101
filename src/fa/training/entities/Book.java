package fa.training.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Book extends Publication {
    private String isbn;
    private String publicationPlace;
    private Set<String> author = new HashSet<>();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    public Set<String> getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.add(author);
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("----Enter book information------");

        System.out.println("Enter publishing year: ");
        int publicationYear = scanner.nextInt();
        setPublicationYear(publicationYear);

        scanner = new Scanner(System.in);
        System.out.println("Enter publisher: ");
        String publisher = scanner.nextLine();
        setPublisher(publisher);

        System.out.println("Enter publication date: ");
        SimpleDateFormat sdf_ddMMyy = new SimpleDateFormat("dd-MM-yyyy");
        Date publicationDate;
        try {
            publicationDate = sdf_ddMMyy.parse(scanner.nextLine());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        setPublicationDate(publicationDate);

        System.out.println("Enter ISBN: ");
        isbn = scanner.nextLine();
        setIsbn(isbn);

        scanner = new Scanner(System.in);
        System.out.println("Enter publication place: ");
        publicationPlace = scanner.nextLine();
        setPublicationPlace(publicationPlace);
    }

    @Override
    public void display() {
        System.out.println("---- Book information ------");
        System.out.println("Publishing year: " + getPublicationYear());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Publication date: " + getPublicationDate());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publication place: " + getPublicationPlace());
        System.out.println("Author: " + author);
    }
}
