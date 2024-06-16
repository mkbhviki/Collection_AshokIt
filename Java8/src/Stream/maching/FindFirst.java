package Stream.maching;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
	
			public static void main(String[] args) {
			
			Person p1 = new Person("Rahul", "India");
			Person p2 = new Person("John", "USA");
			Person p3 = new Person("Stive", "japan");
			Person p4 = new Person("Ching", "China");
			Person p5 = new Person("Dhrub", "Germany");
			Person p6 = new Person("Anu", "India");
			
			List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
			

			Optional<Person> findFirst = persons.stream().filter(p->p.country.equals("India")).findFirst();
			
			if(findFirst.isPresent()) {
				System.out.println(findFirst.get());
			}
			
			
			
		}

	}

	