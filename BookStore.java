import java.util.ArrayList;
import java.util.List;

public class BookStore {
    List<Book> books = new ArrayList<>();

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void sell(Book book) {
        System.out.println("The book " + book.getTitle() + " by " + book.getAuthor().getName() + " is sold for " + book.getPrice());
    }
}
