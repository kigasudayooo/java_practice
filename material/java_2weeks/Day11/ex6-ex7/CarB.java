public class CarB extends Car {
	@Override
	public void drive() {
		System.out.println("CarB runs");
	}
	@Override
	public void stop() {
		System.out.println("CarB stops");
	}
	@Override
	public void turn() {
		System.out.println("CarB turns");
	}
}
