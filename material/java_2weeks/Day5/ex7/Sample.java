public class Sample {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(stack.pop());
		}
	}
}
