package IdenrityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapVsIdentityHasMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hs = new HashMap<>();
		
		hs.put("rahul", 101);
		hs.put("Sashi", 102);
		hs.put("Shayam", 104);
		hs.put(new String("rahul"), 105);//.equal
		
		System.out.println("HM  - Size  : : "+hs.size());
		System.out.println(hs);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		IdentityHashMap<String, Integer> ihm=new IdentityHashMap<>();
		ihm.put("rahul", 101);
		ihm.put("Sashi", 102);
		ihm.put("Shayam", 104);
		ihm.put(new String("rahul"), 105);// ==
		ihm.put("rahul", 106);
		
		System.out.println("IHM - size  : :  "+ihm.size());
		System.out.println(ihm);
		
	}

}
