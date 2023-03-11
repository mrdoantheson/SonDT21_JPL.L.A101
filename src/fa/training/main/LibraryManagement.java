package fa.training.main;

import fa.training.services.LibraryServices;

import java.util.Scanner;

/**
 * @author SonDT21
 */
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryServices libraryServices = new LibraryServices();

        boolean running = true;
        while (running) {
            System.out.println("====== LIBRARY MANAGEMENT SYSTEM ======");
            System.out.println("1. Add a book");
            System.out.println("2. Add a magazine");
            System.out.println("3. Display books and magazines");
            System.out.println("4. Add author to book");
            System.out.println("5. Display top 10 of magazines by volume");
            System.out.println("6. Search books by (isbn, author, publisher)");
            System.out.println("7. End program");
            System.out.println("Enter your choice (1-7):");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    libraryServices.addBook();
                    System.out.println("Add book successfully");
                }
                case 2 -> {
                    libraryServices.addMagazine();
                    System.out.println("Add magazine successfully");
                }
                case 3 -> libraryServices.displayPublications();
                case 4 -> libraryServices.addAuthorToBook();
                case 5 -> libraryServices.display10MagazineByVolume();
                case 6 -> libraryServices.searchBook();
                case 7 -> running = false;
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
