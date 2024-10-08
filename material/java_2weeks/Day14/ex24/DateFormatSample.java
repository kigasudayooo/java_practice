import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatSample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DateFormat formatter 
				= new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(formatter.format(cal.getTime()));
	}
}
