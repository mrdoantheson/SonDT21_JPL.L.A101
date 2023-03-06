package fa.training.main;

import fa.training.entities.Publication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author SonDT21
 */

public class LibraryManagement {
    public static void main(String[] args) {
        List<Publication> listOfPublications = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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

                }
                case 2 -> {

                }
            }
        }
    }
}
