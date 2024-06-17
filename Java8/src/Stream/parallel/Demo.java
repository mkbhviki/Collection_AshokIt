package Stream.parallel;

import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println("====Serial Stream====");
		Stream<Integer> ss = Stream.of(1,2,3,4,5,6);
		
		ss.forEach(n->System.out.println(n+" :: "+Thread.currentThread()));
		
		System.out.println("+++++++++++Perallel Stream++++++");
		
		Stream<Integer> ps = Stream.of(1,2,3,4,5,6);
		ps.parallel().forEach(n->System.out.println(n+" :: "+Thread.currentThread()));
		
		
		
	}

}
