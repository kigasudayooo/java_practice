public class UseImmutableSample {
	public static void main(String[] args) {
		ImmutableSample sample = new ImmutableSample("Java");
		ImmutableSample newSample = sample.addName("!");
		sample.greet();
		newSample.greet();
	}
}
