public class ArrayIndexOutOfBoundsExceptionSample {
	public static void main(String[] args) {
		int[] array = new int[3];
		try {
			array[3] = 10;
			System.out.println(array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// do something
		}
	}
}
