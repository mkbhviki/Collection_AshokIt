package Basic;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList(); // default capacity 10
		al.add(100);
		al.add(200);
		al.add("Mritunjay");
		al.add("Rahul");
		al.add(1000.52);
		
		System.out.println(al);
		
		System.out.println("Size Before Removel ::"+al.size());
		al.remove(0);
		
		System.out.println("Size After Removel ::"+al.size());
		System.out.println(al);
	}

}
