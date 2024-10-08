import java.io.Console;

public class ArrayTest {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		/* int[] allScore */ = new int[10];
		for (int i = 0; i < /* allScore.length */; i++) {
			int inputScore = Integer.parseInt(console.readLine());
			allScore/* [i] */= inputScore;
		}
		int total = 0;
		for (int i = 0; i < /* allScore.length */; i++) {
			total = total + allScore[i];
		}
		int average = total / /*allScore.length */;
		System.out.println(average);
	}
}
