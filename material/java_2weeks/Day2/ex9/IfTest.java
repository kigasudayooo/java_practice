import java.io.Console;

public class IfTest {
	public static void main(String[] args) throws Exception{
		Console console = System.console();
		int score = Integer.parseInt(console.readLine());
		if (0 <= score & score <= 100) {
			System.out.println("�͈͓��ł�");
		} else {
			System.out.println("�͈͊O�ł�");
		}
	}
}
