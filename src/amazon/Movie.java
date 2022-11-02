package amazon;

public class Movie extends Product {
    private String director = null;
    private String title;
    private MovieGenre genre;
    private int price;
    private long productID;

    public Movie(String title, MovieGenre genre, int price, int productID) {
        super(productID, price);
        this.title = title;
        this.genre = genre;
    }

    public Movie(String title, MovieGenre genre, int price, int productID, String director) {
        this(title, genre, price, productID);
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }


    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        if (director != null) System.out.println("Director: " + director);
        System.out.println("Product ID: " + productID);
        System.out.println();
    }

}
