import java.io.Console;

public class Test2 {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		switch (console.readLine()) {
			case "A": System.out.println("one");
			case "B": System.out.println("two");
			case "C": System.out.println("three");
			default: System.out.println("four");
		}
	}
}
