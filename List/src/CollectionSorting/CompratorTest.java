package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompratorTest {
	public static void main(String[] args) {
		
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(101, "David", 10000.00));
		emp.add(new Employee(103, "Rahul", 15000.00));
		emp.add(new Employee(102, "Shayam", 11000.00));
		emp.add(new Employee(104, "Smith", 18000.00));
		emp.add(new Employee(105, "Rathi", 12000.00));
		
		//Collections.sort(emp, new EmpIdCompartor());
		
		//Collections.sort(emp, new EmpNameComprator());
		
		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.salary>e2.salary) {
					return -1;
				}else if (e1.salary<e2.salary) {
					return 1;
					
				}else{
					return 0;
				}
				
			}
		});
		
		for(Employee e: emp) {
			System.out.println(e);
		}
	}

}
