public class UseSubClass {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.hello();
		sub.goodBye();
		
		SuperClass s = new SuperClass();
		s.hello();
		//s.goodBye();
	}
}
