import java.io.Console;

public class LogicalOperator {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		int num = Integer.parseInt(console.readLine());
		if ( /*num < 0 | 100 < num*/ ) {
			System.out.println("不正な値です。");
			System.out.println("0以上100以下の数を入力してください");
		} else if ( 80 <= num ) {
			System.out.println("A判定");
		} else if ( 60 <= num ) {
			System.out.println("B判定");
		} else if ( 40 <= num ) {
			System.out.println("C判定");
		} else {
			System.out.println("E判定");
		}
	}
}
