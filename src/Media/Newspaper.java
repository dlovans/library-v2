package Media;

/**
 * Represents a newspaper, subclassing AuthoredMedia.
 */
public class Newspaper extends AuthoredMedia {
    /**
     * Media type.
     */
    MediaType type;

    /**
     * Creates an instance of Newspaper.
     * @param title - Newspaper title.
     * @param author - Newspaper author.
     * @param publishingYear - Newspaper publishing year.
     */
    public Newspaper(String title, String author, int publishingYear) {
        super(title, author, publishingYear);
        this.type = MediaType.NEWSPAPER;
    }
}
