package BookingSystem;

import Member.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utility class for member submenu.
 */
public class MemberMenuUtils {
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
     * Lists all members. Selectable.
     * @param members - Collection of all members.
     * @return - Index number in collection of selected member.
     */
    private int listAndSelectMember(ArrayList<Member> members) {
        int indexOfMember;
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i));
        }

        indexOfMember = scanner.nextInt() - 1;
        scanner.nextLine();

        return indexOfMember;
    }

    /**
     * Terminates a member.
     * @param members - Collection of all members.
     */
    protected void terminateMember(ArrayList<Member> members) {
        int indexOfMarkedMember;

        System.out.println("Who would you like to mark for termination? ");
        indexOfMarkedMember = this.listAndSelectMember(members);
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
        indexOfMarkedMember = this.listAndSelectMember(members);

        if (members.get(indexOfMarkedMember).upgradeMember()) {
            System.out.println("Member successfully upgraded.");
        } else {
            System.out.println("Member already VIP.");
        }

        System.out.println("Returning to main menu.");
    }


}
