package WeakHashMap;

import java.util.WeakHashMap;

public class Demo {

	public static void main(String[] args) {

		WeakHashMap<Integer, String> whm =new WeakHashMap<>();
		whm.put(1, "Hii");
		whm.put(2, "Hello");
		whm.put(3, "Raja");
		
		
		System.out.println(whm);
		
		
	}

}
