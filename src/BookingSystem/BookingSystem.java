package BookingSystem;

import Member.*;
import Media.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a booking system.
 */
public class BookingSystem {
    /**
     * Scanner object to read console stream.
     */
    final private Scanner scanner = new Scanner(System.in);

    /**
     * Collection of registered members.
     */
    final private ArrayList<Member> membersCollection = new ArrayList<Member>();

    /**
     * Collection of library media.
     */
    final private ArrayList<Media> mediaCollection = new ArrayList<Media>();

    /**
     * An instance of BookingMenuUtils.
     */
    final private BookingMenuUtils bookingMenuUtils = new BookingMenuUtils();

    /**
     * An instance of MemberMenuUtils.
     */
    final private MemberMenuUtils memberMenuUtils = new MemberMenuUtils();

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
                    this.bookingSubMenu();
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
                    this.memberMenuUtils.createMember(membersCollection);
                    break;
                case 2:
                    this.memberMenuUtils.terminateMember(membersCollection);
                    break;
                case 3:
                    this.memberMenuUtils.upgradeMember(membersCollection);
                    break;
                case 4:
                    this.memberMenuUtils.downgradeMember(membersCollection);
                    break;
                case 5:
                    System.out.println("Returning to main menu...");
                    System.out.println();
                    break memberMenuLoop;
            }
        }
    }

    /**
     * Submenu for booking section.
     */
    private void bookingSubMenu() {
        int menuSelection = 0;

        bookingMenuLoop:
        while (menuSelection == 0) {
            System.out.println("1. Create booking...");
            System.out.println("2. Return booking...");
            System.out.println("3. List due date bookings...");
            System.out.println("4. Send invoice for due date bookings...");
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
                    this.bookingMenuUtils.createBooking(membersCollection, mediaCollection);
                    break;
                case 2:
                    this.bookingMenuUtils.returnBooking(membersCollection, mediaCollection);
                    break;
                case 3:
                    // Send invoice for due date bookings.
                case 4:
                    System.out.println("Returning to main menu...");
                    System.out.println();
                    break bookingMenuLoop;
            }
        }

    }
}
