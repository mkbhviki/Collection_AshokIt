package Stream.filter;

import java.io.File;
import java.util.stream.Stream;

public class Demo3 {
	public static void main(String[] args) {
		
		User u1=new User("Amrit",25);
		User u2=new User("Ravi",35);
		User u3=new User("Anu",18);
		User u4=new User("Manu",20);
		User u5=new User("Rahul",32);
		User u6=new User("Anil",35);
		User u7=new User("Mritunjay",31);
		
		Stream<User>stream = Stream.of(u1,u2,u3,u4,u5,u6,u7);
		//stream.filter( i->i.age>20).forEach(i->System.err.println(i));
		//stream.filter( i->i.age>20 && i.name.startsWith("A")).forEach(i->System.err.println(i));
		stream.filter( i->i.age>20) 
				.filter(i-> i.name.startsWith("A"))
            .forEach(i->System.err.println(i));
		
	}

}
class User{
	String name;
	int age;
	
	User(String name, int age){
		this.name=name;
		this.age=age;
				
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
