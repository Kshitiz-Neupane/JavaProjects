public class ElectricCar extends Vehicle {

    // Battery range
    private int batteryRange;

    // Constructor
    public ElectricCar(String make,
                       String model,
                       int year,
                       int batteryRange) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.batteryRange = batteryRange;
    }

    // Overridden method
    @Override
    public void startEngine() {

        System.out.println(
                "Silent electric motor activated.");
    }
}


