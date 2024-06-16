package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {
	public static void main(String[] args) {
		
		//Approach-1
		Stream<Integer> stream=Stream.of(1,2,3,4,5,9);
		ArrayList<String> name = new ArrayList<>();
		name.add("Rahul");
		name.add("Ravi");
		name.add("John");
		
		//Approach-2
		Stream<String> stream2 = name.stream();
		
	}

}
