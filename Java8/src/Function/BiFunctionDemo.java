package Function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bifunction= (a,b) -> a+b;
		
		System.out.println(bifunction.apply(10, 30));
		System.out.println(bifunction.apply(22, 40));
		System.out.println(bifunction.apply(18, 38));
		System.out.println(bifunction.apply(11, 58));
      
	}

}
