package Media;

/**
 * Represents a media.
 */
public class Media {
    /**
     * Title of media.
     */
    protected String title;

    /**
     * Publishing year of media.
     */
    protected int publishingYear;

    protected boolean status;

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
     */
    public boolean loan() {
        if (this.status) {
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
}
