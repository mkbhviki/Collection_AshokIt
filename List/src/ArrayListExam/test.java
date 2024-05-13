package ArrayListExam;

import java.util.ArrayList;
import java.util.ListIterator;

public class test {
  public static void main(String[] args) {
	  
	 ArrayList<Student> al =new ArrayList();
	 al.add(new Student(1, "Raju"));
	 al.add(new Student(2, "Rahul"));
	 al.add(new Student(3, "Ravi"));
	 al.add(new Student(4, "smith"));
	 
		/*
		 * for(Student s : al) { System.out.println(s); }
		 */
	 ListIterator<Student> li = al.listIterator();
	 
	 while(li.hasNext()) {
		 System.out.println(li.next());
	 }
	 System.out.println("+++++++++++++++++++++++++++++++++++++");
	 
	 while(li.hasPrevious()) {
		 System.out.println(li.previous());
	 }
}
}
