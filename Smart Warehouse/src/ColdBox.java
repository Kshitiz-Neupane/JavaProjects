// Child class
class ColdBox extends StorageUnit implements Refrigerated {

    int temperature;

    ColdBox(int id, double capacity) {
        super(id, capacity);
    }

    public void adjustTemp(int t) {
        temperature = t;
        System.out.println("Temperature adjusted to " + temperature + "°C");
    }
}

