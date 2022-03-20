import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookSet = new TreeSet<>();
        addBooks(bookSet);
        printBooks(bookSet);

        bookSet = new TreeSet<>(Comparator.comparingInt(Book::getPageNumber));
        addBooks(bookSet);
        printBooks(bookSet);

    }

    private static void printBooks(TreeSet<Book> bookSet) {
        for (Book book : bookSet) {
            System.out.println(book.getTitle());
        }
    }

    private static void addBooks(TreeSet<Book> bookSet) {
        System.out.println("-------------------------------------------------------------------------------------");
        bookSet.add(new Book("b1", "a1", 299, LocalDate.of(2017, 1, 1)));
        bookSet.add(new Book("b2", "a2", 298, LocalDate.of(2018, 2, 2)));
        bookSet.add(new Book("b3", "a3", 297, LocalDate.of(2019, 3, 3)));
        bookSet.add(new Book("b4", "a4", 296, LocalDate.of(2020, 4, 4)));
        bookSet.add(new Book("b5", "a5", 295, LocalDate.of(2021, 5, 5)));
    }
}
