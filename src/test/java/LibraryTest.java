import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book harryPotter1;
    private Book harryPotter2;
    private Book harryPotter3;
    private Book harryPotter4;

    @Before
    public void before() {
        library = new Library();
        harryPotter1 = new Book("HPPS", "JK R", "Fantasy");
        harryPotter2 = new Book("HPCS", "JK R", "Fantasy");
        harryPotter3 = new Book("HPPA", "JK R", "Fantasy");
        harryPotter4 = new Book("HPTT", "JK R", "Fantasy");
    }

    @Test
    public void hasBooks() {
        library.addBook(harryPotter1);
        assertEquals(1, library.bookCount());
    }



}
