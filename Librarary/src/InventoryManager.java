import java.util.ArrayList;
public class InventoryManager {
    private ArrayList<Product> inventoryList = new ArrayList<>();
    public void addProduct(Product p) {
        inventoryList.add(p);
    }
    public void removeProduct(int productID) {
        for (int i = 0; i < inventoryList.size(); i++) {
            if (inventoryList.get(i).productID == productID) {
                inventoryList.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }
    public void displayInventory() {
        double totalValue = 0;
        System.out.println("\nInventory Details");
        for (Product p : inventoryList) {
            System.out.println(p);
            totalValue += p.price;
        }
        System.out.println("Total Inventory Value = $" + totalValue);
    }
}