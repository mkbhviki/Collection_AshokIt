package methodRef;

@FunctionalInterface
interface myInterface{
	public void m1();
}

public class ConsumerMethodRef {
	
	public static void m2() {
		System.out.println("This is m2() method");
	}
	public static void main(String[] args) {
		//Consumer<String> consumer =(msg) -> System.out.println(msg);
	  // consumer.accept("Hii");
		//ConsumerMethodRef.m2();
		
		myInterface mi=ConsumerMethodRef::m2;
		mi.m1();
		
	}

}
