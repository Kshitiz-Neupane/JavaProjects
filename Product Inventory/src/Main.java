// Main class
public class Main {
    public static void main(String[] args) {

        // Create array of Electronics
        Electronics[] inventory = new Electronics[3];

        inventory[0] = new Electronics("Laptop", 1000);
        inventory[1] = new Electronics("Phone", 500);
        inventory[2] = new Electronics("Tablet", 300);

        // Apply 10% discount to all items
        for (Electronics e : inventory) {
            e.applyDiscount(10.0);
        }
    }
}
