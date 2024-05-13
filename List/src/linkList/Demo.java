package linkList;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		l1.add(1, 15);
		System.out.println(l1);
		System.out.println(l1.getClass());
	}

}
