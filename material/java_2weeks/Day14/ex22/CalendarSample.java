import java.util.Calendar;

public class CalendarSample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 10);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		System.out.println(year + "/" + month + "/" + date);
	}
}
