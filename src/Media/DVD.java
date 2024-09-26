package Media;

/**
 * Represents a DVD, subclassing Media.
 */
public class DVD extends Media {
    /**
     * Director of DVD content.
     */
    protected String director;

    /**
     * Media type.
     */
    MediaType type;

    /**
     * Creates an instance of DVD.
     * @param title - Title of DVD.
     * @param publishingYear - Release year of DVD.
     * @param director - Director of DVD content.
     */
    public DVD(String title, int publishingYear, String director) {
        super(title, publishingYear);
        this.director = director;
        this.type = MediaType.DVD;
    }
}
