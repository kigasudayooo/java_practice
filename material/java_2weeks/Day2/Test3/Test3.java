import java.io.Console;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int result = Integer.parseInt(console.readLine());
		if (/* result < 0 | result > 100 */) {
			System.out.println("不正な数値です");
		} else if (result < 50) {
			System.out.println("努力が必要です");
		} else if (result < 70) {
			System.out.println("普通です");
		} else {
			System.out.println("優秀です");
		}
	}
}
