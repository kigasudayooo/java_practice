import java.io.Console;

public class LogicalOperator {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int num = Integer.parseInt(console.readLine());
		if ( /*num < 0 | 100 < num*/ ) {
			System.out.println("•s³‚È’l‚Å‚·B");
			System.out.println("0ˆÈã100ˆÈ‰º‚Ì”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		} else if ( 80 <= num ) {
			System.out.println("A”»’è");
		} else if ( 60 <= num ) {
			System.out.println("B”»’è");
		} else if ( 40 <= num ) {
			System.out.println("C”»’è");
		} else {
			System.out.println("E”»’è");
		}
	}
}
