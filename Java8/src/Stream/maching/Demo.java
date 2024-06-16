package Stream.maching;

import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Rahul", "India");
		Person p2 = new Person("John", "USA");
		Person p3 = new Person("Stive", "japan");
		Person p4 = new Person("Ching", "China");
		Person p5 = new Person("Dhrub", "Germany");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		boolean Status = persons.stream().anyMatch(p->p.country.equals("India"));
		
		System.out.println("Any Indian Available ?  "+Status);
		System.out.println("==================================");
		boolean Status1 = persons.stream().allMatch(p->p.country.equals("India"));

		System.out.println("All Person are India  ?  "+Status1);
		
		System.out.println("=====================================");
		boolean Status2 = persons.stream().noneMatch(p->p.country.equals("India"));

		System.out.println("No Person From India  ? "+Status2);
		
		
		
	}

}
class Person{
	String name;
	String country;
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
	
	
	
	
}
