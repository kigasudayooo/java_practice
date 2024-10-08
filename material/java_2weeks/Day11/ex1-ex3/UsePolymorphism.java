public class UsePolymorphism {
	public static void main(String[] args) {
		Car car = new CarA();
		car.drive();
		car.turn();
		car.stop();
	}
}
