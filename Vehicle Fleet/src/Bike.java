public class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public double calculateFee() {
        return 100; // bike rental fee
    }
}