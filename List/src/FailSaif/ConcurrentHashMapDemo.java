package FailSaif;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> map =new ConcurrentHashMap<>();
		map.put(101, "one");
		map.put(102, "Two");
		map.put(103, "Three");
		
		KeySetView<Integer,String> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			map.put(104, "Five");
			
		}
		System.out.println(map);
	}

}
