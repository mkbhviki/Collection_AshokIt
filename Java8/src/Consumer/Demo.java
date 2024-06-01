package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
	public static void main(String[] args) {
		Consumer<String> c=(name) -> System.out.println(name +", Good Morning");
		
		c.accept("Rahul");
		c.accept("Java");
		c.accept("vinayak");
		
		
		List<Integer> number = Arrays.asList(10,20,30,40);
		
		//for loop
		//for each loop
		//iterator
		//list iterator
		
		number.forEach(i -> System.out.println(i));
		
	}

}
