import java.util.ArrayList;
public class InventoryManager {
    private ArrayList<Product> inventoryList =
            new ArrayList<Product>();
    public void addProduct(Product p) {
        inventoryList.add(p);
    }
    public void removeProduct(int productID) {

        for (Product p : inventoryList) {

            if (p.productID == productID) {

                inventoryList.remove(p);
                break;
            }
        }
    }
    public void displayInventory() {
        double totalValue = 0;
        System.out.println("\nInventory Details");
        for (Product p : inventoryList) {
            System.out.println(p);
            totalValue = totalValue + p.price;
        }
        System.out.println("Total Inventory Value: Rs. "
                + totalValue);
    }
}

