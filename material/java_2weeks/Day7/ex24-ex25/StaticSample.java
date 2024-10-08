public class StaticSample {
	private static int count = 0;
	public StaticSample() {
		count++;
	}
	public void hello() {
		System.out.println("We are " + count);
	}
}
