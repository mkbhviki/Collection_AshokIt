package Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		 List l= new ArrayList();
		 
		 l.add(100);
		 l.add(200);
		 l.add(300);
		 l.add(400);
		 l.add(600);
		 l.add(null);
		 
		 System.out.println(l);
		 
		// l.add(0, 800);
		// System.out.println(l);
		 //l.set(0, 400);
		// System.out.println(l);
		 
		 //System.out.println(l.contains(700));

		 //System.out.println(l.get(0));
		 
		 //System.out.println(l.indexOf(400));
		 
		// System.out.println(l.lastIndexOf(400));
		 
		// System.out.println(l.indexOf(444));
		// l.clear();
		 //System.out.println(l);
		 
		 List l2 =new ArrayList();
		 l2.add(900);
		 l2.add(1000);
		 l2.add(200);
		 l2.add(300);
		// l2.addAll(l);
		 //l2.addAll(0, l);
		 
		 l2.retainAll(l);
		 
		 System.out.println(l2);
		 
		 
	}

}
