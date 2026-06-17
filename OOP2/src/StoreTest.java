public class StoreTest {
    public static void main(String[] args) {
        InventoryManager manager =
                new InventoryManager();
        Product p1 =
                new Product(101,
                        "Laptop", 80000);
        Product p2 =
                new Product(102,
                        "Mouse", 1500);
        Product p3 =
                new Product(103,
                        "Keyboard", 3000);
        Product p4 =
                new Product(104,
                        "Monitor", 25000);
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.addProduct(p4);
        System.out.println("Before Removing Product");
        manager.displayInventory();
        manager.removeProduct(102);
        System.out.println(
                "\nAfter Removing Product");
        manager.displayInventory();
    }
}

