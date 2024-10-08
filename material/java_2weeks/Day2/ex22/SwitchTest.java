import java.io.Console;

public class SwitchTest {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		switch (a) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		default:
			System.out.println("other");
		}
	}
}
