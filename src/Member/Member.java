package Member;
import Media.Media;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Represents a library member.
 */
public class Member {
    /**
     * Loaned media.
     */
    final protected ArrayList<Media> loanedMedia = new ArrayList<Media>();

    /**
     * If member is a VIP.
     */
    protected boolean isVIP;

    /**
     * Member full name.
     */
    final protected String fullName;

    final protected int birthYear;

    /**
     * Creates an instance of Member with default and specified values.
     */
    public Member(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.isVIP = false;
    }

    /**
     * Upgrades a member to VIP status.
     * @return - Whether member has been upgraded or not.
     */
    protected boolean upgradeMember() {
        if (this.isVIP) {
            return false;
        } else {
            this.isVIP = true;
            return true;
        }
    }

    /**
     * Downgrades a member to regular status.
     * @return - Whether member has been downgraded or not.
     */
    protected boolean downgradeMember() {
        if (this.isVIP) {
            this.isVIP = false;
            return true;
        } else {
            return false;
        }
    }
}
