import java.util.ArrayList;
import java.util.List;

public class UseDifferentElementListSample {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(new Object());
		list.add(new Object());
		list.add(new Object());
		DifferentElementListSample sample
			= new DifferentElementListSample();
		sample.printAll(list);
	}
}
