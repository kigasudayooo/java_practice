public class FinallySample {
	public static void main(String[] args) {
		System.out.println("A");
		try {
			int[] array = null;
			System.out.println("B");
			array[0] = 10;
			System.out.println("C");
		} catch (NullPointerException e) {
			System.out.println("D");
		} finally {
			System.out.println("E");
		}
		System.out.println("F");
	}
}
