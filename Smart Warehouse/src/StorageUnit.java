// Abstract class
abstract class StorageUnit {
    int id;
    double capacity;

    StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Storage ID: " + id);
        System.out.println("Capacity: " + capacity + " liters");
    }
}

