package Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Curser {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
				
		System.out.println("=============For Loop Approach==============");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		System.out.println("=============For-each Loop Approach==============");
		
		for(Object obj :al) {
			System.out.println(obj);
		}
		System.out.println("=============Iterator Approach==============");
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("=============ListIterator Approach==============");
		
		ListIterator listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("=============For-each() Method Approach==============");
		
		al.forEach(i ->{
			System.out.println(i);
		});
	}

}
