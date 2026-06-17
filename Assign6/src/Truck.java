public class Truck extends Vehicle {

    // Truck payload capacity
    private double payloadCapacity;

    // Constructor
    public Truck(String make,
                 String model,
                 int year,
                 double payloadCapacity) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.payloadCapacity = payloadCapacity;
    }

    // Overridden method
    @Override
    public void startEngine() {

        System.out.println(
                "Heavy duty diesel engine starting loudly!");
    }
}

