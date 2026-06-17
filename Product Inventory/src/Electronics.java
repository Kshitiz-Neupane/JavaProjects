// Electronics class implementing Discountable interface
class Electronics implements Discountable {

    String name;
    double price;

    // Constructor
    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Apply discount logic
    public void applyDiscount(double pct) {
        price = price - (price * pct / 100);
        System.out.println(name + " new price: " + price);
    }
}

