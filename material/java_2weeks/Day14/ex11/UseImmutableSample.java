public class UseImmutableSample {
	public static void main(String[] args) {
		ImmutableSample sample = new ImmutableSample("Java");
		sample.addName("!");
		sample.greet();
	}
}
