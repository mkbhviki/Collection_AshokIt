package ChangeInInterface;

@FunctionalInterface
interface MyinterfaceTwo {
	public void m2();
}

public class MyAppWithLembda {
	public static void main(String[] args) {
		
	
	
	MyinterfaceTwo mit= () -> System.out.println("m2 method called...");
	mit.m2();
	
}
}
