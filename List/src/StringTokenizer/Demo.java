package StringTokenizer;

import java.util.StringTokenizer;

public class Demo {
	public static void main(String[] args) {
		String s= "Java is a Programing Course";
		StringTokenizer st = new StringTokenizer(s, " ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
