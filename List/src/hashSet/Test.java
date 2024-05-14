package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
 
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		
		hs.add(new Student(101, "raju"));
		hs.add(new Student(102, "rahul"));
		hs.add(new Student(103, "rani"));
		hs.add(new Student(104, "rajan"));
		
		Iterator<Student> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
