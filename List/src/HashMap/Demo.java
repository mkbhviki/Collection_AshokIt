package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		Map<Integer,String> m= new HashMap<>();
		
		m.put(101, "Rahul");
		m.put(102, "Raja");
		m.put(103, "Mritunjay");
		m.put(104, "Rani");
		m.put(102, "Shayam");
		
		System.out.println(m.get(101));
		System.out.println(m.get(1000));
		
		Collection<String> value = m.values();
		for(String v : value) {
			System.out.println(v);
		}
		
		Set<Integer> keySet = m.keySet();
		for(Integer key : keySet) {
			System.out.print(key+"  :");
			System.out.println(m.get(key));
		}
		System.err.println("_____________________________________________________________");
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		/*
		 * Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		 * System.err.println(
		 * "----------------------------------------------------------------------");
		 * while(iterator.hasNext()) { Entry<Integer, String> entry = iterator.next();
		 * System.out.println(entry.getKey()+"   : "+entry.getValue()); }
		 */
		
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"  : "+entry.getValue());
			
		}
		
		
		 
		
		System.out.println(m.size());
		System.out.println(m.containsKey(102));
		System.out.println(m.containsKey(110));
		System.out.println(m.containsValue("Raja"));
		System.out.println(m.isEmpty());
		System.out.println(m);

		m.clear();
		
		System.err.println(m);
		
	}

}
