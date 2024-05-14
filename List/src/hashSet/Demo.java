package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Four");
		hs.add(null);
		
		System.out.println(hs);
		hs.remove("Two");
		System.out.println(hs);
		
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
