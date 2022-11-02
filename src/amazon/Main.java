package amazon;

import java.util.*;

public class Main {

    static Map<Long, Movie> movieMap = new HashMap<>();

    public static void main(String[] args) {

        Book lotr = new Book("Lord of the Rings", "J.R.R Tolkien", 799, 57365372);
        Book headFirst = new Book("Head First Java", "Bert Bates & Kathy Sierra", 699, 75643276);
        ChildrensBook joppe = new ChildrensBook("Rädda Joppe – död eller levande", "Gunnel Linde", 1, "DANGER, might induce strong reactions in children of all ages!", 75326425);

        Movie theoryOfEverything = new Movie("The Theory Of Everything", MovieGenre.DRAMA, 179, 753753);
        Movie dieHard = new Movie("Die Hard", MovieGenre.ACTION, 179, 7532);
        Movie inception = new Movie("Inception", MovieGenre.ACTION, 150, 7537853, "Christopher Nolan");
        addMovieToMap(theoryOfEverything, dieHard, inception);

        Product[] objects = {lotr, headFirst, dieHard, theoryOfEverything, inception};
        List<Product> objectsList = Arrays.stream(objects).toList();

        for (Product object : objectsList) {
            if (object instanceof Book) {
                ((Book) object).printDetails();
            } else if (object instanceof Movie) {
                ((Movie) object).printDetails();
            }
        }

        long iD1 = 7537853;
        long iD2 = 7531;
        Movie movie1 = findMovieByID(iD1);
        Movie movie2 = findMovieByID(iD2);

        if (movie1 != null) {
            System.out.println("Found a match:");
            movie1.printDetails();
        } else {
            System.out.println("Search did not return a match.");
        }
        if (movie2 != null) {
            System.out.println("Found a match:");
            movie2.printDetails();
        } else {
            System.out.println("Search did not return a match.");
        }

        System.out.println(lotr);
        System.out.println(joppe);
    }

    private static void addMovieToMap(Movie... movies) {
        Arrays.stream(movies).forEach(movie -> movieMap.put(movie.getProductID(), movie));
    }

    private static Movie findMovieByID(long key) {
        if (movieMap.get(key) == null) {
            return null;
        }
        return movieMap.get(key);
    }
}

