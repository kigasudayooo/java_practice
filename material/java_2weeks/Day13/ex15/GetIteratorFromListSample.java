import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetIteratorFromListSample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
	}
}
