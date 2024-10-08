import java.io.Console;

public class IfTest {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int score = Integer.parseInt(console.readLine());
		if (score < 0 | 100 < score) {
			System.out.println("”ÍˆÍŠO‚Å‚·");
		} else {
			System.out.println("”ÍˆÍ“à‚Å‚·");
		}
	}
}
