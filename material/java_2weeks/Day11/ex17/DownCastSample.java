public class DownCastSample {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
		SubClass sub = (SubClass) s;
	}
}
