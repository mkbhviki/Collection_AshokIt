package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
}

public class PersonDemo {
	

	public static void main(String[] args) {
		Person p1 = new Person("Ravi", 30);
		Person p2 = new Person("Rahul", 3);
		Person p3 = new Person("Rakhi", 35);
		Person p4 = new Person("shashi", 37);
		Person p5 = new Person("rajan", 9);
		Person p6 = new Person("Lalit", 32);
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Person> predicate = p -> p.age >= 18;
		
		for( Person person: persons) {
			if(predicate.test(person)) {
				System.out.println(person.name);
			}
		}
		
	}
}
