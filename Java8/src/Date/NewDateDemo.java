package Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {
	
	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate plusMonths = date.plusMonths(1);
		System.out.println(plusMonths);
		
		LocalDate plusMonths1 = date.plusMonths(2);
		System.out.println(plusMonths1);
		
		boolean leapYear = LocalDate.parse("2024-12-22").isLeapYear();
		System.out.println("Leap Year   :  "+leapYear);
		
		boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
		System.out.println("Before Date  :  "+ before);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);
		
		LocalTime datetime = LocalTime.now();
		System.out.println("DateTime  :  "+datetime);
		
		Period p = Period.ofDays(5);
		System.out.println(p.getDays());
		
		Period between = Period.between(LocalDate.parse("2002-06-27"), LocalDate.now());
		System.out.println(between);
		
		
		
		
		
		
	}

}
