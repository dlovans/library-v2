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
            System.out.println("1. Media section...");
            System.out.println("2. Member section...");
            System.out.println("3. Exit program...");

            if (scanner.hasNextInt()) {
                menuSelection = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Please enter a valid option!");
                continue;
            }

            switch (menuSelection) {
                case 1:
                    // Open media submenu.
                    break;
                case 2:
                    // Open member submenu.
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
            }
        }
    }
}
