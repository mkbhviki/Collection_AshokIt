package Stream.map;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Amrit","Anil","Ravi","Rahul","Anu");
		
		names.stream().filter(n->n.startsWith("A")).map(n->n+"-"+n.length()).forEach(n->System.out.println(n));
		
		

	}

}
