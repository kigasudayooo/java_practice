import java.util.Iterator;

public class UseIterableSample {
	public static void main(String[] args) {
		IterableSample<String> sample = new IterableSample<>();
		sample.add("A");
		sample.add("B");
		sample.add("C");
		Iterator<String> ite = sample.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str); 
		}
	}
}
