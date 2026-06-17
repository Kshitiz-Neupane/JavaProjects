class Vehicle {

    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Mainn {

    public static void main(String[] args) {

        Car c = new Car();

        c.move();
        c.drive();
    }
}



