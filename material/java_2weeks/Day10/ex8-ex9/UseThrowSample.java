public class UseThrowSample {
	public void sample() {
		ThrowSample s = new ThrowSample();
		try {
			s.test(null);
		} catch (Exception e) {
			// do something
		}
	}
}
