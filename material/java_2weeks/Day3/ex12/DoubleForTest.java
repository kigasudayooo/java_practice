public class DoubleForTest {
	public static void main(String[] args) {
		for (int j = 0; j < 3; j++) {
			for (int i = 0; /* i < j + 1*/ ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
