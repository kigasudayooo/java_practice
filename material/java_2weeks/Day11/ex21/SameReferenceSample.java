public class SameReferenceSample {
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		System.out.println(a == b);
	}
}
