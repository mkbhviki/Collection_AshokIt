package Stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {
		
		List<String> javacourses = Arrays.asList("Core java","Adv java","Springboot");
		List<String> uicourses = Arrays.asList("html","css","bs","js");
		
		List<List<String>> courses = Arrays.asList(javacourses,uicourses);
		
		//courses.stream().forEach(c->System.out.println(c));
		
		Stream<String> flatMap = courses.stream().flatMap(c->c.stream());
		flatMap.forEach(c->System.out.println(c));
	
}

}
