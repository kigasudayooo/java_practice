public class UsePolymorphism {
	public static void main(String[] args) {
		Car car = CarFactory.create();
		car.drive();
		car.turn();
		car.stop();
	}
}
