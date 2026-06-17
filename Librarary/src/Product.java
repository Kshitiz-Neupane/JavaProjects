public class Product {
    int productID;
    String productName;
    double price;

    Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return "ID: " + productID +
                ", Name: " + productName +
                ", Price: $" + price;
    }
}