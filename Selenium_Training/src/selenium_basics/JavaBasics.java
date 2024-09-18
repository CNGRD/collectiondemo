package selenium_basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaBasics {

	public static void main(String[] args) 
	{
		Date dateObj=new Date();
		//System.out.println(dateObj.toString());
		
		//System.out.println(dateObj);
		
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		String actdate=f.format(dateObj);
		System.out.println("Actual Date :"+actdate);
		
		
		SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal=f1.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,30);
		
		String dateReqire = f1.format(cal.getTime());
		
		
		System.out.println("Before Date :"+dateReqire);
		
		
	}

}
