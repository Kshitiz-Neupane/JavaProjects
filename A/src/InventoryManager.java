import java.util.ArrayList;
public class InventoryManager {
    private ArrayList<Product> inventoryList;
    public InventoryManager() {
        inventoryList = new ArrayList<>();
    }
    public void addProduct(Product p) {
        inventoryList.add(p);
    }
    public void removeProduct(int productID) {
        for (int i = 0; i < inventoryList.size(); i++) {

            if (inventoryList.get(i).getProductID() == productID) {
                inventoryList.remove(i);
                System.out.println("\nProduct with ID " + productID + " removed.");
                return;
            }
        }
        System.out.println("Product not found.");
    }
    public void displayInventory() {
        double totalValue = 0;
        System.out.println("\n===== Inventory List =====");
        for (Product p : inventoryList) {
            System.out.println(p);
            totalValue += p.getPrice();
        }
        System.out.println("--------------------------");
        System.out.println("Total Inventory Value = $" + totalValue);
    }
}

