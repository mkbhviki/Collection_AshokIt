package Predicate;

import java.util.function.Predicate;

public class Demo {
	// Method Without lambda
		public boolean test(int i) {
			if(i>10) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void main(String[] args) {
			
		Predicate<Integer>	p= i -> i >10;
		
		//p.test(20);
		System.out.println(p.test(2));
			
		}
		
	

}
