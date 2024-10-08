public class UseReThrowSample {
	public static void main(String[] args) {
		UseThrowSample s = new UseThrowSample();
		try {
			s.sample();
		} catch (Exception e) {
			// do something
		}
	}
}
