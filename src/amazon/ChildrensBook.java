package amazon;

public class ChildrensBook extends Book {
    private final String recommendedAgeInfo;

    public ChildrensBook(String title, String author, int price, String recommendedAgeInfo) {
        super(title, author, price);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Recommended age info: " + recommendedAgeInfo;
    }
}
