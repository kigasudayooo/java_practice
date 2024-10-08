public class UseIterableSample {
	public static void main(String[] args) {
		IterableSample<String> sample = new IterableSample<>();
		sample.add("A");
		sample.add("B");
		sample.add("C");
		for (String str : sample) {
			System.out.println(str);
		}
	}
}
