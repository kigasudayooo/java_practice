public class GarbageCollectionTest {
	public static void main(String[] args) {
		Sample a = new Sample();
		Sample b = a;
		a = null;
		b = new Sample();
	}
}
