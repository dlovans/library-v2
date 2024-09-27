package BookingSystem;

import Member.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utility class for member submenu.
 */
public class MemberMenuUtils extends MenuUtils {
    /**
     * Scanner object to read console stream.
     */
    final private Scanner scanner = new Scanner(System.in);

    /**
     * Creates a member, appends member to collection.
     * @param members - Collection of library members.
     */
    protected void createMember(ArrayList<Member> members) {
        String name;
        int birthYear;

        System.out.println("Enter the full name of the new member: ");
        name = scanner.nextLine();
        System.out.println("Enter the birth year of the new member: ");
        birthYear = scanner.nextInt();
        scanner.nextLine();
        members.add(new Member(name, birthYear));
        System.out.println("Members added successfully.");
        System.out.println();
    }

    /**
     * Terminates a member.
     * @param members - Collection of all members.
     */
    protected void terminateMember(ArrayList<Member> members) {
        int indexOfMarkedMember;

        System.out.println("Who would you like to mark for termination? ");
        indexOfMarkedMember = super.listAndSelectMember(members);

        if (indexOfMarkedMember == -1) {
            System.out.println("Library has no members :S");
            System.out.println("Returning to main menu.");
            return;
        }

        members.remove(indexOfMarkedMember);

        System.out.println("Member successfully terminated.");
        System.out.println("Returning to main menu.");

    }

    /**
     * Upgrades member to VIP status.
     * @param members - Collection of all members.
     */
    protected void upgradeMember(ArrayList<Member> members) {
        int indexOfMarkedMember;
        System.out.println("Who would you like to upgrade to VIP status? ");
        indexOfMarkedMember = super.listAndSelectMember(members);

        if (indexOfMarkedMember == -1) {
            System.out.println("Library has no members :S");
            System.out.println("Returning to main menu.");
            return;
        }

        if (members.get(indexOfMarkedMember).upgradeMember()) {
            System.out.println("Member successfully upgraded.");
        } else {
            System.out.println("Member already VIP.");
        }

        System.out.println("Returning to main menu.");
    }

    /**
     * Downgrades a member to regular status.
     * @param members - Collection of members.
     */
    protected void downgradeMember(ArrayList<Member> members) {
        int indexOfMarkedMember;
        System.out.println("Who would you like to downgrade to regular status? ");
        indexOfMarkedMember = super.listAndSelectMember(members);

        if (indexOfMarkedMember == -1) {
            System.out.println("Library has no members :S");
            System.out.println("Returning to main menu.");
            return;
        }

        if (members.get(indexOfMarkedMember).downgradeMember()) {
            System.out.println("Member successfully downgraded.");
        } else {
            System.out.println("Member already regular status.");
        }

        System.out.println("Returning to main menu.");
    }
}
