import java.io.Console;

public class IfTest {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int score = Integer.parseInt(console.readLine());
		if (score < 0 | 100 < score) {
			System.out.println("�͈͊O�ł�");
		} else {
			System.out.println("�͈͓��ł�");
		}
	}
}
