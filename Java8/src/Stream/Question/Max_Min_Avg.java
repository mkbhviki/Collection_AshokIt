package Stream.Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max_Min_Avg {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Rahul",50000);
		Employee e2 = new Employee(2,"Anu",40000);
		Employee e3 = new Employee(3,"Ravi",45000);
		Employee e4 = new Employee(4,"Deepa",35000);
		Employee e5 = new Employee(5,"Amrit",55000);
		Employee e6 = new Employee(6,"Shyam",60000);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		
		System.out.println("Max Salary :: "+max.get().salary);
		
		System.out.println("=====================================");
		
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));

		System.out.println("Min Salary  :: "+min.get().salary);
		
	}

}


class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
