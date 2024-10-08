import java.util.List;

public class DifferentElementListSample {
	public void printAll(List list) {
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}
	}
}
