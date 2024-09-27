package BookingSystem;

import Member.*;
import Media.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utility class for booking submenu.
 */
public class BookingMenuUtils extends MenuUtils {
    /**
     * Scanner object to read console stream.
     */
    final private Scanner scanner = new Scanner(System.in);

    /**
     * Creates a booking.
     * @param members - Collection of members.
     * @param medias - Collection of media.
     */
    protected void createBooking(ArrayList<Member> members, ArrayList<Media> medias) {
        int indexOfMarkedMember;
        int indexOfMediaToLoan;
        Member member;
        Media media;

        System.out.println("Select member making a booking? ");
        indexOfMarkedMember = super.listAndSelectMember(members);

        if (indexOfMarkedMember == -1) {
            System.out.println("Library has no members.");
            System.out.println("Returning to main menu");
            return;
        }

        member = members.get(indexOfMarkedMember);

        System.out.println("Select media to loan: ");
        indexOfMediaToLoan = this.listAndSelectMedia(medias);

        if (indexOfMediaToLoan == -1) {
            System.out.println("Library has no media.");
            System.out.println("Returning to main menu");
            return;
        }

        media = medias.get(indexOfMediaToLoan);
        if (media.loan(member.getMemberStatus())) {
            member.addLentMedia(media);
            medias.remove(indexOfMediaToLoan);
            System.out.println("Successfully loaned member.");
        } else {
            System.out.println("Failed to loan member.");
        }
        System.out.println("Returning to main menu");
    }

    /**
     * Lists all media. Selectable.
     * @param medias - Collection of media.
     * @return - Index number for selected media.
     */
    private int listAndSelectMedia(ArrayList<Media> medias) {
        int indexOfMedia;

        if (medias.isEmpty()) { return -1; }

        for (int i = 0; i < medias.size(); i++) {
            System.out.println((i + 1) + ". " + medias.get(i));
        }

        indexOfMedia = scanner.nextInt() - 1;
        scanner.nextLine();
        return indexOfMedia;
    }

    protected void returnBooking(ArrayList<Member> members, ArrayList<Media> medias) {
        int indexOfMarkedMember;
        int indexOfMediaToReturn;
        Member member;
        System.out.println("Select member making a return? ");

        indexOfMarkedMember = super.listAndSelectMember(members);

        if (indexOfMarkedMember == -1) {
            System.out.println("Library has no members.");
            System.out.println("Returning to main menu");
            return;
        }

        member = members.get(indexOfMarkedMember);

        System.out.println("Select media to return: ");
        int counter = 0;
        ArrayList<Media> lentMedias = member.getLoanedMedia();
        for (Media lentMedia: lentMedias) {
            System.out.println((counter + 1) + ". " + lentMedia);
            counter++;
        }

        indexOfMediaToReturn = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indexOfMediaToReturn == -1) {
            System.out.println("Library has no media.");
            System.out.println("Returning to main menu");
            return;
        }

        medias.add(lentMedias.get(indexOfMediaToReturn));
        lentMedias.remove(indexOfMediaToReturn);
        System.out.println("Media successfully returned.");
        System.out.println("Returning to main menu");
        System.out.println();
    }
}
