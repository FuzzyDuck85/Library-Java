import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;


    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();

    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Book> getStock() {
        return stock;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stockCount() < this.capacity){
            this.stock.add(book);
        }
    }

    public Book removeFromStock(){
        Book bookBorrowed = null;
        if(this.stockCount() > 0){
            bookBorrowed = this.stock.remove(0);
        }
        return bookBorrowed;
    }


}
