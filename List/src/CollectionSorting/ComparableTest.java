package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	public static void main(String[] args) {
		
		ArrayList<Student>al =new ArrayList<>();
		
		al.add(new Student(101, "John", 1));
		al.add(new Student(102, "Smith", 5));
		al.add(new Student(103, "Ravi", 3));
		al.add(new Student(104, "Rahul", 2));
		al.add(new Student(105, "Shashi", 4));
		
		Collections.sort(al);
		
		for (Student s:al) {
			System.out.println(s);
		}
	}

}
