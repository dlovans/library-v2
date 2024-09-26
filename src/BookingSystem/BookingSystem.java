package BookingSystem;
import Media.*;
import Member.*;

import java.util.Scanner;

/**
 * Represents a booking system.
 */
public class BookingSystem {
    /**
     * Scanner object to read console stream.
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Interface to interact with program.
     */
    public void menu() {
        int menuSelection;

        System.out.println("Welcome to Booking System");
        System.out.println("What would you like to do?");
        System.out.println();

        while (true) {
            System.out.println("1. Lend media...");
            System.out.println("2. Return media...");
            System.out.println("3. List lent media...");
            System.out.println("4. List all media...");
            System.out.println("5. Exit program...");

            if (scanner.hasNextInt()) {
                menuSelection = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Please enter a valid option!");
                continue;
            }

            switch (menuSelection) {
                case 1:
                    // Lend a media.
                    break;
                case 2:
                    // Return a media.
                    break;
                case 3:
                    // List lent media.
                    break;
                case 4:
                    // List all media.
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
            }
        }
    }
}
