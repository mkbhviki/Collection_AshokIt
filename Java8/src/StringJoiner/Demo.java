package StringJoiner;

import java.util.StringJoiner;

public class Demo {
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("Mritunjay");
		sj1.add("It");
		sj1.add("Java");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner("-","(",")");
		sj2.add("Mritunjay");
		sj2.add("It");
		sj2.add("Java");
		System.out.println(sj2);
	}

}
