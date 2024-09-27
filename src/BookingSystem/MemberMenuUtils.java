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
        members.add(new Member(name, birthYear));
        System.out.println("Members added successfully.");
        System.out.println();
    }
}
