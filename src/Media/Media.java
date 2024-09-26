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

    /**
     * Creates an instance of Media.
     * @param title - Title of media.
     * @param publishingYear - Media publishing year.
     */
    public Media(String title, int publishingYear) {
        this.title = title;
        this.publishingYear = publishingYear;
    }
}
