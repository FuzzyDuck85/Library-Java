import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getCollection() {
        return this.collection.size();
    }

    public void borrowBook(Library library, Book book){
        Book bookBeingBorrowed = library.removeFromStock();
        if(bookBeingBorrowed != null){
            this.collection.add(book);
        }
    }

//    public Book returnBook(){
//        Book bookBorrowed = null;
//        if(this.getCollection() > 0){
//            bookBorrowed = this.collection.remove(0);
//        }
//        return bookBorrowed;
//    }
}
