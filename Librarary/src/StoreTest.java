public class StoreTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 800));
        manager.addProduct(new Product(102, "Mouse", 20));
        manager.addProduct(new Product(103, "Keyboard", 50));
        manager.addProduct(new Product(104, "Monitor", 200));

        System.out.println("Before Removing Product");
        manager.displayInventory();

        manager.removeProduct(102);

        System.out.println("\nAfter Removing Product");
        manager.displayInventory();
    }
}

