package Stream.slicing;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {

		List<String> javacourses = Arrays.asList("Core java", "Adv java", "Springboot", "restapi", "jsp");

		javacourses.stream().limit(2).forEach(c -> System.out.println(c));
		System.out.println("--------------------------------");
		javacourses.stream().skip(2).forEach(c -> System.out.println(c));

		List<String> javacourses1 = Arrays.asList("jsp", "restapi", "Core java", "Adv java", "Springboot", "restapi",
				"jsp");
		System.out.println("=================================");
		javacourses1.stream().distinct().forEach(c -> System.out.println(c));

	}

}
