package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_utils{
	
	public static String getCalendarDate(String dateFormat, int daysToAddOrSubtract)
	{
		
		// 1. Converts Date format to String Format
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);		// Converts date format to Formatted String - "03/08/2026" to "03-08-2026"				 
		
		Date now = new Date();			// creating object of Date class which stores the current system date and time ->  Sun Mar 08 12:10:45 IST 2026
		System.out.println("Today's date is: "+sdf.format(now));		// converts Date object to formatted string	--> 03-08-2026
		
		// 2. Create Calender object and set the time to now
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);		// setting time to now so calculation starts from todays date
		
		// 3. Move forward or backward on the basis of condition
		
			// Moving calendar days forward  
		while(daysToAddOrSubtract > 0)
		{
			cal.add(Calendar.DAY_OF_MONTH, 1);	// move calendar date forward by 1 day
			System.out.println("Adding 1 day");
			
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);	// finds out weekday- Sunday-1, Monday-2....Saturday-7
		
			// skipping saturday and sunday. Only counting weekdays
			if(dayOfWeek!=Calendar.SATURDAY && dayOfWeek!=Calendar.SUNDAY)
			{
				daysToAddOrSubtract--;		// decreasing remaining days
			}		
		}
		
		// Moving calendar days backward  
		while(daysToAddOrSubtract < 0)
		{
			cal.add(Calendar.DAY_OF_MONTH, -1);		// move calendar date backward by 1 day
			System.out.println("Subtracting 1 day");
			
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			
			if(dayOfWeek!=Calendar.SATURDAY && dayOfWeek!=Calendar.SUNDAY)
			{
				daysToAddOrSubtract++;		// increasing remaining days till while loop condition matches
			}
		}
		
		// 4. Get the final calculated date from the calendar and convert it into String format
		
		Date finalCalculatedDate = cal.getTime();
		
		String finalDate = sdf.format(finalCalculatedDate);		//	"03-11-2026"
		
		System.out.println("Date after "+daysToAddOrSubtract+" days is: "+finalDate);
		
		return finalDate;
		
	}
	
	
}
