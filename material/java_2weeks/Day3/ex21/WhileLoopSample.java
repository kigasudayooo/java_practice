import java.io.Console;

public class WhileLoopSample {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		while ( /* true */ ) {
			System.out.print("*");
			a--;
			if ( /* a <= 0 */ ) {
				break;
			}
		}
	}
}
