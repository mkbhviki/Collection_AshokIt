package TreeMap;

import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm= new TreeMap<>();
		
		tm.put("Rahul", 101);
		tm.put("Abhi", 102);
		tm.put("Shami", 103);
		
		System.err.println(tm);
	}

}
