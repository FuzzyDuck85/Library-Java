import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Craighead");
        book = new Book ("Jurassic Park", "Michael Crichton", "Science Fiction");
    }

    @Test
    public void canAddToStock(){
        library.add(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void canRemoveBookFromStock(){
        library.add(book);
        library.removeFromStock();
        assertEquals(0, library.stockCount());
    }
}
