public class ArrayReferenceSample {
	public static void main(String[] args) {
		int[] arrayA = {10, 20, 30};
		int[] arrayB = arrayA;
		arrayB[0] = 40;
		for (int val : arrayA) {
			System.out.println(val);
		}
	}
}
