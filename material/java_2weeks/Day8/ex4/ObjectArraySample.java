public class ObjectArraySample {
	public static void main(String[] args) {
		Sample[] samples 
			= { new Sample(), new Sample(), new Sample() };
		for (Sample sample : samples) {
			sample.hello();
		}
	}
}
