package amazon;

public class MovieWithDirector extends Movie {
    private final String director;

    public MovieWithDirector(String title, MovieGenre genre, int price, int productID, String director) {
        super(title, genre, price, productID);
        this.director = director;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Director: " + director);
    }
}
