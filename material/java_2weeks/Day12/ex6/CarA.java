public class CarA implements Car {
	@Override
	public void drive() {
		System.out.println("CarA runs");
	}
	@Override
	public void stop() {
		System.out.println("CarA stops");
	}
	@Override
	public void turn() {
		System.out.println("CarA turns");
	}
}
