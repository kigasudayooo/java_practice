public class SameValueSample {
	public static void main(String[] args) {
		Client a = new Client(100, "xxx");
		Client b = new Client(100, "xxx");
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
