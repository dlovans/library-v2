package Media;

import java.util.Calendar;

/**
 * Represents a media.
 */
public abstract class Media {
    /**
     * Title of media.
     */
    protected String title;

    /**
     * Publishing year of media.
     */
    protected int publishingYear;

    /**
     * Media availability.
     */
    protected boolean status;

    /**
     * Loan time for media.
     */
    protected Calendar loanTime;

    /**
     * Creates an instance of Media.
     * @param title - Title of media.
     * @param publishingYear - Media publishing year.
     */
    public Media(String title, int publishingYear) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.status = true;
    }

    /**
     * Lends the media.
     * @return - Whether media was lent or not.
     */
    public boolean loan(boolean isVIP) {
        if (this.status) {
            loanTime = Calendar.getInstance();
            if (isVIP) {
                // 1-month loan period for VIPs.
                loanTime.set(Calendar.MONTH, 1);
            } else {
                // 2 weeks loan period for regular members.
                loanTime.set(Calendar.WEEK_OF_YEAR, 2);
            }
            this.status = false;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Return the media.
     * @return - Whether media was returned or not.
     */
    public boolean returnMedia() {
        if (!this.status) {
            this.status = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns loan time for a lent media.
     * @return - Loan time.
     */
    public Calendar getLoanTime() {
        return loanTime;
    }

    /**
     * Media availability.
     * @return - Availability of media.
     */
    public boolean getStatus() {
        return status;
    }
}
