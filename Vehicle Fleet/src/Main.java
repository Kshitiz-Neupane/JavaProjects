import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Bike("Yamaha Bike"));
        fleet.add(new Bus("City Bus"));

        for (Vehicle v : fleet) {
            System.out.println(v.getName() + " Fee: " + v.calculateFee());
        }
    }
}

