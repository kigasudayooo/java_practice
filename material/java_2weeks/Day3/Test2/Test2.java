import java.io.Console;

public class Test2 {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int val = Integer.parseInt(console.readLine());	
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < val + 1; j++) {
				System.out.print("*");
			}
		}
	}
}
