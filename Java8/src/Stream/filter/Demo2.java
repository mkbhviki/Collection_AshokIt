package Stream.filter;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("John","Ravi","Abhi","Anu","manu");
		
		name.stream().filter(n ->n.startsWith("A")).forEach(n->System.out.println(n));
	}

}
