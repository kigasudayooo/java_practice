public class Test5 {
	public static void main(String[] args) {
		int val = 10;	
		if (0 < val) {
			if (val < 100) {
				System.out.println("A");
			}
			System.out.println("B");
		} else if (10 <= val) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		System.out.println("E");
	}
}
