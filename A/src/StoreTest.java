public class StoreTest {

    public static void main(String[] args) {

        InventoryManager inventory = new InventoryManager();

        inventory.addProduct(new Product(101, "Laptop", 1200.00));
        inventory.addProduct(new Product(102, "Mouse", 25.50));
        inventory.addProduct(new Product(103, "Keyboard", 75.00));
        inventory.addProduct(new Product(104, "Monitor", 300.00));

        System.out.println("INITIAL INVENTORY");
        inventory.displayInventory();

        inventory.removeProduct(102);

        System.out.println("\nUPDATED INVENTORY");
        inventory.displayInventory();
    }
}


