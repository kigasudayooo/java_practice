public class UseInstanceOfSample {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		if (s instanceof SuperClass) {
			System.out.println("ok");
		}
	}
}
