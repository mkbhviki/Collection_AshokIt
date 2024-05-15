package ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {

		ArrayDeque<String> ad= new ArrayDeque<>();
		ad.add("One");
		ad.add("Two");
		ad.add("Three");
		
		System.out.println(ad);
		ad.pollFirst();
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
	}

}
