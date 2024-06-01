package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	 String name;
	 String location;
	 String dept;
	 
	 Employee(String name, String location, String dept){
		 this.name =name;
		 this.location=location;
		 this.dept=dept;	 
		 }
 }

public class JoinDemo {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Rahul", "Delhi", "Java");
		Employee e2 = new Employee("Rajan", "patna", "Php");
		Employee e3 = new Employee("Lalit", "delhi", "Dotnet");
		Employee e4 = new Employee("Ravi", "Mumbai", "c");
		Employee e5 = new Employee("Sashi", "Gaya", "Java");
		Employee e6 = new Employee("Mritunjay", "Delhi", "c++");
		Employee e7 = new Employee("deepika", "Delhi", "Java");
		
		
		List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		Predicate<Employee> employe1= e -> e.location.equals("Delhi");
		Predicate<Employee> employe2= e -> e.dept.equals("Java");
		Predicate<Employee> emp3= e -> e.name.startsWith("R");
		
		Predicate<Employee> e= employe1.and(employe2).and(emp3);
		//Predicate<Employee> e= employe1.or(employe2);
		
		for(Employee E: emp) {
			if(e.test(E)) {
				System.out.println(E.name);
			}
		}
		
		
	}

}
