package amazon;


public class Book implements Product {
    private final String title;
    private final String author;
    private final int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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
