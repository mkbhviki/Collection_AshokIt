package ChangeInInterface;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car Started...");
		
	}

	/*
	 * @Override public void clean() { System.out.println("Vehicle.clean()...");
	 * Vehicle.super.clean(); }
	 */
public void m1() {
		
		Vehicle.super.clean();
		Vehicle.stop();
	}

}
