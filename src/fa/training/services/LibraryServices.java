package fa.training.services;

import fa.training.entities.Publication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServices {
    public List<Publication> listOfPublications;

    public LibraryServices(List<Publication> listOfPublications) {
        this.listOfPublications = listOfPublications;
    }

    //add a new book.
    //add a new magazine.
    public void addPublication(Publication publication) {
        listOfPublications.add(publication);
    }

    // to display the list of all books and magazines that have the same publication year and publisher
    public void displayPublicationsByYearAndPublisher(List<Publication> publications) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter publication year: ");
        int year = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();

        List<Publication> matchingPublications = new ArrayList<>();

        for (Publication publication : publications) {
            if (publication.getPublicationYear() == year && publication.getPublisher().equals(publisher)) {
                matchingPublications.add(publication);
            }
        }

        if (matchingPublications.isEmpty()) {
            System.out.println("No publications found.");
        } else {
            System.out.printf("List of publications published by %s in %d:%n", publisher, year);
            for (Publication publication : matchingPublications) {
                publication.display();
            }
        }
    }

    //add an author to a specific book, if the author existed, the program should print a message “Author existed”, otherwise print “Add successfully”.
    public void addAuthorToBook() {
        //TODO Auto-generated method stub
    }

    //display the list of top 10 magazines which have the largest volume.
    public void displayTop10Magazines() {
        //TODO Auto-generated method stub
    }

    //search book by isbn
    public void searchBookByISBN() {
        //TODO Auto-generated method stub
    }

    //search book by author
    public void searchBookByAuthor() {
        //TODO Auto-generated method stub
    }

    //search book by publisher
    public void searchBookByPublisher() {
        //TODO Auto-generated method stub
    }
}
