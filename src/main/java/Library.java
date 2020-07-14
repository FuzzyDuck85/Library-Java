import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> stock;

    public Library(String name) {
        this.name = name;
        this.stock = new ArrayList<Book>();
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void add(Book book) {
        this.stock.add(book);
    }

    public Book removeFromStock(){
        Book bookBorrowed = null;
        if(this.stockCount() > 0){
            bookBorrowed = this.stock.remove(0);
        }
        return bookBorrowed;
    }
}
