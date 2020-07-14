
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book ("Jurassic Park", "Michael Crichton", "Science Fiction");
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void libraryStartsWithNoStock(){
        assertEquals(0, library.stockCount());
    }


    @Test
    public void canAddToStock(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void canRemoveBookFromStock(){
        library.addBook(book);
        library.removeFromStock();
        assertEquals(0, library.stockCount());
    }
}
