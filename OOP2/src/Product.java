public class Product {

    int productID;
    String productName;
    double price;

    public Product(int productID, String productName, double price) {

        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public String toString() {

        return "Product ID: " + productID +
                ", Product Name: " + productName +
                ", Price: Rs. " + price;
    }
}


