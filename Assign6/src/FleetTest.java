public class FleetTest {
    public static void main(String[] args) {
        // Create Truck object
        Truck truck =
                new Truck(
                        "Volvo",
                        "FH16",
                        2024,
                        25.5);
        // Create ElectricCar object
        ElectricCar car =
                new ElectricCar(
                        "Tesla",
                        "Model S",
                        2025,
                        650);
        // Display truck details
        System.out.println("Truck Information");
        System.out.println(truck.make + " " + truck.model);
        // Start truck engine
        truck.startEngine();
        System.out.println();
        // Display electric car details
        System.out.println("Electric Car Information");
        System.out.println(car.make + " " + car.model);
        // Start electric car motor
        car.startEngine();
    }
}

