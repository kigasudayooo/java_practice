public class TerribleArraySample {
	public void sample(Object[] array) {
		int index = 0;
		for (Object obj : array) {
			if (obj == null) {
				break;
			}
			index++;
		}
		// some code
	}
}
