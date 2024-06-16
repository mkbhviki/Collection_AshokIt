package Stream.map;

import java.util.stream.Stream;



public class Demo3 {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Ravi",35,31000.00);
		Employee emp2 = new Employee("Anu",18,15000.00);
		Employee emp3 = new Employee("Khusi",22,36000.00);
		Employee emp4 = new Employee("Rahul",32,35000.00);
		Employee emp5 = new Employee("Raj",36,350880.00);
		Employee emp6 = new Employee("Amrit",34,44000.00);
		Employee emp7 = new Employee("Sweta",28,20000.00);
		
		Stream<Employee>stream = Stream.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
		
		//stream.filter(e->e.salary>20000).map(e->e.name +" - "+e.age).forEach(e->System.out.println(e));
		stream.filter(e->e.salary>20000).forEach(e->System.out.println(e.name+" - "+e.age));
		
		
		
		
		
	}

}
class Employee{
	String name;
	int age;
	double salary;
	
	
	
	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
}
