package Predicate;

import java.util.function.Predicate;

public class Demo2 {
	public static void main(String[] args) {
		
	
	String [] names ={"Anu","Manu","Radha","Akki","Hari"};
	
	Predicate<String> p = name -> name.charAt(0) == 'A';
	
	for( String name : names) {
		if(p.test(name)) {
			System.out.println(name);
		}
		
	}

}
}
