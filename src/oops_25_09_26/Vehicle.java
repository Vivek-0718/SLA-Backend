package oops_25_09_26;

class Vehicle {
    private int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {

    Car(int speed) {
        super(speed);
    }

    @Override
    void start() {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {

    Bike(int speed) {
        super(speed);
    }

    @Override
    void start() {
        System.out.println("Bike starts");
    }
}