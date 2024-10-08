import java.io.Console;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int result = Integer.parseInt(console.readLine());
		if (/* result < 0 | result > 100 */) {
			System.out.println("•s³‚È”’l‚Å‚·");
		} else if (result < 50) {
			System.out.println("“w—Í‚ª•K—v‚Å‚·");
		} else if (result < 70) {
			System.out.println("•’Ê‚Å‚·");
		} else {
			System.out.println("—DG‚Å‚·");
		}
	}
}
