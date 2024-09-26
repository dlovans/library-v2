package Media;

/**
 * Represents a book.
 */
public class Book extends AuthoredMedia {
    /**
     * Media type.
     */
    protected MediaType type;

    /**
     * Creates an instance of Book.
     * @param title - Title of book.
     * @param author - Author of book.
     * @param publishingYear - Publishing year of book.
     */
    public Book(String title, String author, int publishingYear) {
        super(title, author, publishingYear);
        this.type = MediaType.BOOK;
    }
}
