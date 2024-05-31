package ChangeInInterface;
@FunctionalInterface
public interface Vehicle {
	
	
	public void start();
	
	public default void clean() {
		System.out.println("Vehicle.clean()");
		
	}
	public static void stop() {
		System.out.println("Vehicle.stop()");
	}

}
