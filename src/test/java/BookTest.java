import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book ("Jurassic Park", "Michael Crichton", "Science Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Jurassic Park", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Michael Crichton", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Science Fiction", book.getGenre());
    }
}
