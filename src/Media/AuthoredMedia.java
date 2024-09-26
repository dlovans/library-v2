package Media;

/**
 * Represents authored media, subclassing Media.
 */
public abstract class AuthoredMedia extends Media {
    /**
     * Author of written media.
     */
    protected String author;

    /**
     * Creates an instance of AuthoredMedia.
     * @param title - Title of authored media.
     * @param author - Author of authored media.
     * @param publishingYear - Authored media publishing year.
     */
    public AuthoredMedia(String title, String author, int publishingYear) {
        super(title, publishingYear);
        this.author = author;
    }
}
