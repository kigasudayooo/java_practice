import java.io.Console;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int result = Integer.parseInt(console.readLine());
		if (/* result < 0 | result > 100 */) {
			System.out.println("�s���Ȑ��l�ł�");
		} else if (result < 50) {
			System.out.println("�w�͂��K�v�ł�");
		} else if (result < 70) {
			System.out.println("���ʂł�");
		} else {
			System.out.println("�D�G�ł�");
		}
	}
}
