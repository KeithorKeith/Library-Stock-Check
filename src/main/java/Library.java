import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryStock;

    public Library() {
        this.libraryStock = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.libraryStock.add(book);
    }

    public int bookCount() {
        return this.libraryStock.size();
    }


}
