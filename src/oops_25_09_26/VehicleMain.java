package oops_25_09_26;

public class VehicleMain {
	public static void main(String[] args) {
		Car vehicle1 = new Car(120);
        vehicle1.start();
        vehicle1.stop();
        System.out.println("Car speed: " + vehicle1.getSpeed());

        System.out.println();

        Bike vehicle2 = new Bike(80);
        vehicle2.start();
        vehicle2.stop();
        System.out.println("Bike speed: " + vehicle2.getSpeed());
	}
}
