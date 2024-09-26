package Media;

/**
 * Represents authored media.
 */
public abstract class AuthoredMedia {
    /**
     * Author of written media.
     */
    protected String author;

    public AuthoredMedia(String author) {
        this.author = author;
    }
}
