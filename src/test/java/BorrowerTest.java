import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;


    @Before
    public void before(){
        borrower = new Borrower("Donald");
        library = new Library("Craighead Public Library",5);
        book1 = new Book ("Jurassic Park", "Michael Crichton", "Science Fiction");
        book2 = new Book ("Darkly Dreaming Dexter", "Jeff Lindsay", "Thriller");
        book3 = new Book ("A Game of Thrones", "George R. R. Martin", "Fantasy");
        book4 = new Book ("IT", "Stephen King", "Horror");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Donald", borrower.getName());
    }

    @Test
    public void borrowHasNoBooks(){
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void canBorrowABookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        borrower.borrowBook(library, book2);
        assertEquals(1, borrower.getCollection());
        assertEquals(3, library.stockCount());
    }

//    @Test
//    public void canReturnBookToLibrary(){
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//        library.addBook(book4);
//        borrower.borrow(library, book1);
//        borrower.borrow(library, book2);
//        borrower.borrow(library, book3);
//        borrower.borrow(library, book4);
//        borrower.returnBook(book1);
//        assertEquals(1, library.stockCount());
//        assertEquals(3, borrower.getCollection());
//    }
}
