import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 2, 28);
		cal.add(Calendar.DATE, 1);
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(formatter.format(cal.getTime()));
	}
}
