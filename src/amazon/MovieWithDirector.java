package amazon;

public class MovieWithDirector extends Movie {
    private String director = null;

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
