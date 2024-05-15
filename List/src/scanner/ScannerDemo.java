package scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Firt Name");
		int i=sc.nextInt();
		System.out.println("Enter Second Number");
		int j= sc.nextInt();
		
		System.out.println("Result  : "+(i+j));
		
		sc.close();
	}

}
