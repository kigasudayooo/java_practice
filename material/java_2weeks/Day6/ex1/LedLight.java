public class LedLight {
	private int status = 0;
	public void lightUp() {
		if (status == 0) {
			status = 1;
			System.out.println("light on!");
		}
	}
	public void lightDown() {
		if (status == 1) {
			status = 0;
			System.out.println("light off!");
		}
	}
}
