package amazon;


public class Book extends Product {
    private String title;
    private String author;

    public Book(String title, String author, int price, long productID) {
        super(productID, price);
        this.title = title;
        this.author = author;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public String toString() {
        return "Title: " + title + System.lineSeparator() + "Author: " + author + System.lineSeparator() + "Price: " + price;
    }
}
