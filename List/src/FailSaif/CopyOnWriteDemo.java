package FailSaif;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {

	public static void main(String[] args) {
	CopyOnWriteArrayList<Integer> al= new CopyOnWriteArrayList<>();
	
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	
	for(Integer a: al) {
		System.out.println(a);
		if(a==100) {
			al.add(150);
		}
	}
	System.out.println(al);
		
	}

}
