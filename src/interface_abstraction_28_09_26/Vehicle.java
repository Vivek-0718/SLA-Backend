package interface_abstraction_28_09_26;

public interface Vehicle {
	void start();
	void stop();
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car starts");
	}
	@Override
	public void stop() {
		System.out.println("Car stops");
	}
}
class Bike implements Vehicle{
	@Override
	public void start() {
		System.out.println("Bike starts");
	}
	@Override
	public void stop() {
		System.out.println("Bike stops");
	}
}
