package Stream.Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByDemo {
	public static void main(String[] args) {
		
	
	Employee1 e1 = new Employee1(1,"Rahul",50000,"India");
	Employee1 e2 = new Employee1(2,"Anu",40000,"USA");
	Employee1 e3 = new Employee1(3,"Ravi",45000,"China");
	Employee1 e4 = new Employee1(4,"Deepa",35000,"USA");
	Employee1 e5 = new Employee1(5,"Amrit",55000,"Germany");
	Employee1 e6 = new Employee1(6,"Shyam",60000,"Nepal");
	
	List<Employee1> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
	Map<String, List<Employee1>> data = list.stream().collect(Collectors.groupingBy(e->e.country));
	System.out.println(data);
	
	
}

}


class Employee1{
int id;
String name;
double salary;
String country;
public Employee1(int id, String name, double salary ,String country) {
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.country=country;
}
@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
}



}





