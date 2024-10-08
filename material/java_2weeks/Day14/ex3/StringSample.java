public class StringSample {
	private final static String STR = "Hello, Java!";
	public static void main(String[] args) {
		String a = STR;
		String b = STR;
		System.out.println( a == b );
	}
}
