import java.util.Calendar;

public class CalendarSample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 2, 1);
		cal.add(Calendar.DATE, -1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		System.out.println(year + "/" + month + "/" + date);
	}
}
