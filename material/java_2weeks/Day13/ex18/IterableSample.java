import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableSample<T> implements Iterable<T> {
	private List<T> list = new ArrayList<>();
	public void add(T element) {
		this.list.add(element);
	}
	@Override
	public Iterator<T> iterator() {
		return this.list.iterator();
	}
}
