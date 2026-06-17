public class Bus extends Vehicle {

    public Bus(String name) {
        super(name);
    }

    @Override
    public double calculateFee() {
        return 500; // bus rental fee
    }
}