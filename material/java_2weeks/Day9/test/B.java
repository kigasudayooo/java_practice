package test;
import sample.A;

public class B extends A {
	public void goodBye() {
		super.hello();
		System.out.println("good-bye");
	}
}
