public class StringSplitSample {
	public static void main(String[] args) {
		String str = "a,b,c,d,e";
		String[] array = str.split(",");
		for (String val : array) {
			System.out.println(val);
		}
	}
}
