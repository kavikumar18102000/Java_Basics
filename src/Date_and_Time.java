import java.util.Date;

public class Date_and_Time {

	public static void main(String[] args) {
		System.out.println("Total number of years passed from 1970 till 2022 is : " + System.currentTimeMillis()/1000/3600/24/365);
		
		//using date class to access the date....
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
	}

}
