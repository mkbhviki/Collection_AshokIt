package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		System.out.println(d);
		
		//Converting Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf1.format(d);
		System.out.println(format);
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
	String format1 = sdf2.format(d);
	System.out.println(format1);
	
	//Convert String to Date
	
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
	Date parseDate =sdf3.parse("2024-06-15");
	System.out.println(parseDate);
	
}

}
