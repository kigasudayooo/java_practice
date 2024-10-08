public class ExceptionHandlingSample {
	public static void main(String[] args) {
		try {
			int[] array = null;
			array[0] = 10;
			System.out.println(array[0]);
		} catch (NullPointerException e) {
			System.out.println("error");
		}
	}
}
