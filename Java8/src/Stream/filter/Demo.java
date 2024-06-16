package Stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(66,88,58,12,10);
		
		/*
		 * for(Integer i: list) { if(i>18) { System.out.println(i); } }
		 */
		
		/*
		 * Stream<Integer> stream = list.stream(); Stream<Integer> filter =
		 * stream.filter(i ->i>18); filter.forEach(i ->System.out.println(i));
		 */
		
		list.stream().filter(i -> i>18).forEach(i ->System.out.println(i));
		
	}

}
