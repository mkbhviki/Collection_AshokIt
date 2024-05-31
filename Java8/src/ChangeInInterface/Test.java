package ChangeInInterface;

public class Test {
	public static void main(String[] args) {
		
		Car car =new Car();
		car.start();
		car.clean();
		
		Vehicle.stop();
		
		
		  String s1='\u0020'+"Hello  "; 
		 // String s1= "Hello"; 
		  String s2= new String("Hello"); 
		  
		  String s3= new String("Hello").intern(); 
		  String s4="ABC";
		  s1=s1.concat(s4); 
		  s1=s1.substring(0, 3);
		  
		  System.out.println(s1==s2); System.out.println(s1.equals(s2));
		  System.out.println(s1==s3);
		  System.out.println(s4.hashCode());//s1*31^n-1+s2*31^n-2......
		  System.out.println(s1.substring(0,2)); System.out.println(s1.trim());
		  System.out.println(s1.concat(s4));
		  
		  
		 
		
		
		
		
		
	}

}
