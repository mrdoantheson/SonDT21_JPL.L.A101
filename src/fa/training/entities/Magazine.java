package fa.training.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author SonDT21
 */

public class Magazine extends Publication {
    private String author;
    private int volumn;
    private int edition;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }



    @Override
    public void inputData(Scanner scanner) {
        System.out.println("----Enter magazine information------");

        scanner = new Scanner(System.in);
        System.out.println("Enter publishing author: ");
        String author = scanner.nextLine();
        setAuthor(author);

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

        System.out.println("Enter volumn: ");
        int volumn = scanner.nextInt();
        setVolumn(volumn);

        System.out.println("Enter edition: ");
        int edition = scanner.nextInt();
        setEdition(edition);
    }

    @Override
    public void display() {
        System.out.println("----Magazine information------");
        System.out.println("Publishing year: " + getPublicationYear());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Publication date" + getPublicationDate());
        System.out.println("Volumn: " + getVolumn());
        System.out.println("Edition: " + getEdition());
        System.out.println("Author: " + getAuthor());
    }
}
