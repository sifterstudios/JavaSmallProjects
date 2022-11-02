package amazon;

public class ChildrensBook extends Book {
    private String recommendedAgeInfo;

    public ChildrensBook(String title, String author, int price, String recommendedAgeInfo, long productID) {
        super(title, author, price, productID);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Recommended age info: " + recommendedAgeInfo;
    }
}
