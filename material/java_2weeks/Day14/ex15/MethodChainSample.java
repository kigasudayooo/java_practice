public class MethodChainSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append(", ").append("Java");
		String message = sb.toString();
		System.out.println(message);
	}
}
