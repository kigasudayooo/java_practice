public class ShortCircuitSample {
	public static void main(String[] args) {
		int a = 1;
		int i = 4;
		i++;
		if (a == 1 || i < 5) {
			// do something
		}
		System.out.println(i);
	}
}
