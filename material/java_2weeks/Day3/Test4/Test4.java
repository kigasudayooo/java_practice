public class Test4 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				break;
				//continue;
			}
			total += i;
		}
		System.out.println(total);
	}
}
