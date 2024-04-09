package BasicsProrames;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentDateAndTime {
	public static void main(String[] args) {
		
		int seconeds, min, hr, day, month, year;

		GregorianCalendar gc = new GregorianCalendar();
		
		day = gc.get(Calendar.DAY_OF_MONTH);
		month = gc.get(Calendar.MONTH);
		year = gc.get(Calendar.YEAR);
		System.out.println("Current date is : " + day + "/" + (month + 1) + "/" + year);
		
		seconeds=gc.get(Calendar.SECOND);
		min=gc.get(Calendar.MINUTE);
		hr= gc.get(Calendar.HOUR);
		System.out.println("Cureent Time : "+hr+":"+min+":"+seconeds);
	}
}
