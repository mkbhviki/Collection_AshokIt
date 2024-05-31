package ChangeInInterface;

import java.util.HashMap;

interface MyInterfaceOne{
	public void m1();
}

public class MyAppWithoutLembda implements MyInterfaceOne{

	
	public void m1() {
		var v1=101;
		var v2="Hii";
		var v3=new HashMap<Integer,String>();
		System.out.println("MyAppWithoutLembda.m1()");
		
	}
	public static void main(String[] args) {
		MyAppWithoutLembda mapp=new MyAppWithoutLembda();
		mapp.m1();
	}
	

}
