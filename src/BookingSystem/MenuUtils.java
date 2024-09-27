package BookingSystem;

import Member.Member;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Base class for utility classes.
 */
public abstract class MenuUtils {
    /**
     * Lists all members. Selectable.
     * @param members - Collection of all members.
     * @return - Index number in collection of selected member.
     */
    protected int listAndSelectMember(ArrayList<Member> members) {
        Scanner scanner = new Scanner(System.in);
        if (members.isEmpty()) { return -1; }
        int indexOfMember;
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i));
        }

        indexOfMember = scanner.nextInt() - 1;
        scanner.nextLine();

        return indexOfMember;
    }}
