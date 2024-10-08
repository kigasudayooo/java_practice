public class UseRobot {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.setName("Java Robot");
		robot.setLight(new LedLight());
		robot.sayHello();
	}
}
