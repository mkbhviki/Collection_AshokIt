package Stream.interviwQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	public static void main(String[] args) {
		
		ArrayList<Employee2> emps = new ArrayList<Employee2>();
		
		emps.add(new Employee2(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emps.add(new Employee2(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emps.add(new Employee2(3, "David", 29, "Male", "Infrastructure", 2012,18000.0));
		emps.add(new Employee2(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emps.add(new Employee2(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emps.add(new Employee2(6, "Cathy", 43, "Male", "Security", 2010, 105000.0));
		emps.add(new Employee2(7, "Ramesh", 35, "Male", "Finance", 2016, 27000.0));
		emps.add(new Employee2(8, "Suresh", 31, "Male", "Development", 2015, 45000.0));
		emps.add(new Employee2(9, "Gita", 24, "Female", "Sales", 2014, 15700.0));
		emps.add(new Employee2(10, "Gouri", 35, "Female", "Development", 2019, 35000.0));
		emps.add(new Employee2(11, "Mahesh", 38, "Male", "Security", 2015, 28000.0));
		emps.add(new Employee2(12, "Nitin", 27, "Male", "Development", 2016, 55000.0));
		emps.add(new Employee2(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		emps.add(new Employee2(14, "Buttler", 32, "Male", "Sales", 2017, 10700.0));
		emps.add(new Employee2(15, "Ashok", 32, "Male", "Infrastructure", 2018, 12700.0));
		emps.add(new Employee2(16, "Sanvi", 26, "Female", "HR", 2011, 25500.0));
		
		Map<String, Long> map1 = emps.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.counting()));
		System.out.println("Total number of Male And Femail  : "+map1);
		
		emps.stream()
		//.map(e->e.department)
		.map(Employee2::getDepartment)
		.distinct().forEach(name->System.out.println("Name of Department  ::  "+name));
		
		Map<String, Double> map2 = emps.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.averagingInt(Employee2::getAge)));
		System.out.println("Avg Age of Male And female  ::  "+map2);
		
		
		/*Optional<Employee2> map3 = emps.stream().collect(Collectors.maxBy(Comparator.comparing(Employee2::getSalary)));
		System.out.println("Highest Paid Emp   ::  "+map3.get().name+"    "+map3.get().salary);
		*/
		
		Optional<Employee2> map3 = emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee2::getSalary)));
		
		if(map3.isPresent()) {
			Employee2 employee2 = map3.get();
			System.out.println(employee2);
			
		}
		
		emps.stream().filter(e -> e.yearOfJoining > 2015).map(e->e.name).forEach(name ->System.out.println("Name of Empyoyee Who Join after 2015  ::"+name));
		
		
		Map<String, Long> map4 = emps.stream().collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.counting()));
	
		System.out.println("DepartmentBy Emp :: "+map4);
		
		Map<String, Double> map5 = emps.stream().collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.averagingDouble(Employee2::getSalary)));
		System.out.println("DepartmentBy Avg Salary : "+map5);
		
		Optional<Employee2> min = emps.stream().filter(e->e.gender.equals("Male")&& e.getDepartment().equals("Development")).min(Comparator.comparing(Employee2::getAge));
		if(min.isPresent()) {
			System.out.println("Min Ag of Male in Development Department ::"+min.get());
		}
		
		Optional<Employee2> maxExp = emps.stream().collect(Collectors.minBy(Comparator.comparing(Employee2::getYearOfJoining)));
		if(maxExp.isPresent()) {
			System.out.println("Person Which Has Max Exp  :  "+maxExp.get());
		}
		
		Map<String, Long> map6 = emps.stream()
				.filter(e -> e.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee2::getGender,Collectors.counting()));
		System.out.println("Total number of Male And Femail In Sales Team  : "+map6);
		
		
		//get Emp who has second highest Salary

		Optional<Employee2> SecondHighSalary = emps.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Person Who has second Highest Salary :: "+SecondHighSalary.get());
		
		List<Employee2> list = emps.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Person Who has second Highest Salary :: "+list.get(1));
	}

}
class Employee2{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	
	
	public Employee2(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
}
