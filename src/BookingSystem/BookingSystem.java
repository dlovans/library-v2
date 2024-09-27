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
                    this.mediaSubMenu();
                    break;
                case 2:
                    this.memberSubMenu();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
            }
        }
    }

    /**
     * Submenu for member section.
     */
    private void memberSubMenu() {
        int menuSelection = 0;

        memberMenuLoop:
        while (menuSelection == 0) {
            System.out.println("Member Section: ");
            System.out.println("1. Create member...");
            System.out.println("2. Terminate member...");
            System.out.println("3. Upgrade member...");
            System.out.println("4. Downgrade member...");
            System.out.println("5. Return to main menu...");

            if (scanner.hasNextInt()) {
                menuSelection = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Please enter a valid option!");
                continue;
            }

            switch (menuSelection) {
                case 1:
                    // Create member.
                    break;
                case 2:
                    // Terminate member.
                    break;
                case 3:
                    // Upgrade member.
                    break;
                case 4:
                    // Downgrade member.
                    break;
                case 5:
                    System.out.println("Returning to main menu...");
                    System.out.println();
                    break memberMenuLoop;
            }
        }
    }

    /**
     * Submenu for media section.
     */
    private void mediaSubMenu() {
        int menuSelection = 0;

        mediaMenuLoop:
        while (menuSelection == 0) {
            System.out.println("1. List due date loans...");
            System.out.println("2. Send invoice for due date loans...");
            System.out.println("3. Return to main menu...");
            if (scanner.hasNextInt()) {
                menuSelection = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Please enter a valid option!");
                continue;
            }

            switch (menuSelection) {
                case 1:
                    // List media with due date.
                    break;
                case 2:
                    // Send invoice for due date loans.
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    System.out.println();
                    break mediaMenuLoop;
            }
        }

    }
}
