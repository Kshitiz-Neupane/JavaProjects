public class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public double calculateFee() {
        return 0; // default
    }

    public String getName() {
        return name;
    }
}