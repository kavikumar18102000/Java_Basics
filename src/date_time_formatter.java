import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime dt = LocalDateTime.now(); // This is the date.....
		System.out.println(dt);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-yyyy-MM"); // This is the format....
		String d = dt.format(df);
		System.out.println(d);

	}

}
