package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		
		ts.add(5);
		ts.add(1);
		ts.add(9);
		ts.add(88);
		ts.add(5);
		
		System.err.println(ts);
		
		Iterator iterator = ts.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
