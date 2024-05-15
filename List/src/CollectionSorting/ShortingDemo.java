package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class ShortingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al= new  ArrayList<>();
		
		al.add(8);
		al.add(5);
		al.add(69);
		al.add(1);
		al.add(9);
		
		System.out.println("Before sorting   :"+al);
		
		Collections.sort(al);
		
		System.out.println("After shorting   :"+al);
		
		Collections.reverse(al);
		System.out.println("After Reversh    :"+al);
		

	}

}
