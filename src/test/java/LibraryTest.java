
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        library = new Library(5);
        book1 = new Book ("Jurassic Park", "Michael Crichton", "Science Fiction");
        book2 = new Book ("Darkly Dreaming Dexter", "Jeff Lindsay", "Thriller");
        book3 = new Book ("A Game of Thrones", "George R. R. Martin", "Fantasy");
        book4 = new Book ("IT", "Stephen King", "Horror");
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void libraryStartsWithNoStock(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void checkBookIsInStock(){
        library.addBook(book1);
        assertEquals(true, library.checkStock(book1));
    }


    @Test
    public void canAddToStock(){
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void canRemoveBookFromStock(){
        library.addBook(book1);
        library.removeFromStock();
        assertEquals(0, library.stockCount());
    }

    @Test
    public void cannotExceedCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(5, library.stockCount());
    }

}
