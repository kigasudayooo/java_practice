import java.io.Console;

public class IfTest {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		if (100 < a)
			System.out.println("�G���[");
		else if (a < 0)
			System.out.println("�G���[");
		else if (10 < a)
			System.out.println("�傫��");
		else
			System.out.println("������");
	}
}
