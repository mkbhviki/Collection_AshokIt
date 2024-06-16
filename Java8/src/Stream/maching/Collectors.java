package Stream.maching;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Collectors {
	public static void main(String[] args) {
		
		Person p1 = new Person("Rahul", "India");
		Person p2 = new Person("John", "USA");
		Person p3 = new Person("Stive", "japan");
		Person p4 = new Person("Ching", "China");
		Person p5 = new Person("Dhrub", "Germany");
		Person p6 = new Person("Anu", "India");
		
	
	   List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6);
	   
	   
	   //list.stream().collect(java.util.stream.Collectors.toList());
	   
		/*
		 * List<Person> filter =
		 * list.stream().filter(p->p.country.equals("India")).collect(java.util.stream.
		 * Collectors.toList());
		 * 
		 * System.out.println(filter.size()); filter.forEach(i ->System.out.println(i));
		 */
		
	   List<String> Indians = list.stream().filter(p ->p.country.equals("India")).map(p ->p.name).collect(java.util.stream.Collectors.toList());
	   
	   Indians.forEach(i->System.out.println(i));
	}

	}

