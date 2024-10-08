public class DownCastSample {
	public static void main(String[] args) {
		SuperClass s = new SuperClass();
		if (s instanceof SubClass) {
			SubClass sub = (SubClass) s;
		}
	}
}
