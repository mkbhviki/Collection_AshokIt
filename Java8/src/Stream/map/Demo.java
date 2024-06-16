package Stream.map;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Amrit","Anil","Ravi","Rahul","Anu");
		
		/*
		 * for(String n:name) { System.out.println(n.toUpperCase()); }
		 */
		
		name.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		name.stream().mapToInt(n->n.length()).forEach(n->System.out.println(n));
		
	}

}
