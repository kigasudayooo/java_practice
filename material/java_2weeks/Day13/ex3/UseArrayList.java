import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
			for (int i = 0; i < list.size(); i++) { 
				String str = (String) list.get(i);
				System.out.println(str);
			}
		}
	}
