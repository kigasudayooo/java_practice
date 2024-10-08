import java.util.ArrayList;
import java.util.List;

public class UseDifferentElementListSample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add(new Object());
		DifferentElementListSample sample
			= new DifferentElementListSample();
		sample.printAll(list);
	}
}
