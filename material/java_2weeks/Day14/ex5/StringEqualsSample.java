import java.io.Console;

public class StringEqualsSample {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		String str = console.readLine();
		if ("".equals(str)) {
			System.out.println("BLANK");
		}
	}
}
