package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumbersSort1 {
	public static void main(String[] args) {
		 
		ArrayList<Integer> al = new ArrayList();
		
		al.add(5);
		al.add(2);
		al.add(9);
		al.add(1);
		al.add(3);
		
		System.out.println("Before Sort ::  "+al);
		
		//Collections.sort(al, new NumberComparator());
		
		//Collections.sort(al,(i,j)->i.compareTo(j));
		Collections.sort(al,(i,j)->(i>j)? -1:1);
		
		al.forEach(i-> System.out.println(i));
		System.out.println("After sort ::  "+al);
	}

}
class NumberComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer j) {
		if(i>j) {
			return -1;
		}else if(i<j) {
			return 1;
		}
		
		return 0;
	}
	
}
