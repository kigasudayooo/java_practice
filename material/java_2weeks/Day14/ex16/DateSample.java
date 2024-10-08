import java.util.Date;

public class DateSample {
	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime();
		System.out.println(time);
	}
}
