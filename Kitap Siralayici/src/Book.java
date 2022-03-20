import java.time.LocalDate;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int pageNumber;
    private LocalDate publishDate;

    public Book(String title, String author, int pageNumber, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book book) {
        return this.title.compareTo(book.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }
}