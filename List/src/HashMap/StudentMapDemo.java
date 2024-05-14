package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMapDemo {

	public static void main(String[] args) {

		Student s1= new Student(101, "John");
		Student s2= new Student(102, "Rahul");
		Student s3= new Student(105, "Mritunjay");
		
		Map<Integer, Student> map= new HashMap<Integer,Student >();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		System.err.println(map);
		System.out.println(map.containsKey(104));
		/*
		 * Set<Integer> keySet = map.keySet(); for(Integer key :keySet) {
		 * System.err.println(map.get(key)); }
		 */
		
		Set<Entry<Integer,Student>> entrySet = map.entrySet();
		
		for(Entry<Integer,Student> key : entrySet) {
			System.out.println(key.getKey()+"   :  "+ key.getValue());
		}
		
	}

}
