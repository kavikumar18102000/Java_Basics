import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_class {
	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println(cal.isLeapYear(2022));
		
		// Time Zone class...
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		
	}
	
	
	

}
