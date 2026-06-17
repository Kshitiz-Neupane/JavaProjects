public class Device {
    String name;

    void turnOn() {
        System.out.println("--------------Device is now ON.-------------");
    }
}

class SmartLight extends Device {
    @Override
    void turnOn() {
        System.out.println("The light is shining at 75% brightness.");
    }
}

class SmartFan extends Device {
    @Override
    void turnOn() {
        System.out.println("The fan is spinning at high speed.");
    }
}