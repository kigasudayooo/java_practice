public class StringBuilderSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(", ");
		sb.append("Java");
		String message = sb.toString();
		System.out.println(message);
	}
}
