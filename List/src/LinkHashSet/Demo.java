package LinkHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs= new LinkedHashSet<>();
		
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("One");
		lhs.add(null);
		
		System.out.println(lhs);
		
		Iterator<String> iterator = lhs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
