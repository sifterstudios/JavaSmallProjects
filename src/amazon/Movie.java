package amazon;

public class Movie implements Product, Comparable<Movie> {
    private final String title;
    private final MovieGenre genre;
    private final int price;
    private final long productID;

    public Movie(String title, MovieGenre genre, int price, int productID) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.productID = productID;
    }


    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Product ID: " + productID);
        System.out.println();
    }

    @Override
    public int compareTo(Movie m) {
        if (productID == m.productID) return 0;
        return productID < m.productID ? -1 : 1;
    }

    public Long getProductID() {
        return productID;
    }
}

