package amazon;

public abstract class Product {
    long productID;
    int price;

    public Product(long productID, int price) {
        this.productID = productID;
        this.price = price;
    }

    public Product() {

    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void printDetails();
}
