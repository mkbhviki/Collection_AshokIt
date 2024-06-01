package Function;

import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		
		Function<String, Integer> f= (name) -> name.length();
		System.out.println(f.apply("Rahul"));
		System.out.println(f.apply("Mritunjay"));
		System.out.println(f.apply("Sashi"));
		
	}

}
