import java.io.Console;

public class LogicalOperator {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int num = Integer.parseInt(console.readLine());
		if ( /*num < 0 | 100 < num*/ ) {
			System.out.println("�s���Ȓl�ł��B");
			System.out.println("0�ȏ�100�ȉ��̐�����͂��Ă�������");
		} else if ( 80 <= num ) {
			System.out.println("A����");
		} else if ( 60 <= num ) {
			System.out.println("B����");
		} else if ( 40 <= num ) {
			System.out.println("C����");
		} else {
			System.out.println("E����");
		}
	}
}
