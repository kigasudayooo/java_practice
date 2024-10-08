public class Robot {
	private String name;
	private LedLight light;
	public void sayHello() {
		light.lightUp();
		System.out.println("Hi, I'm " + name);
		light.lightDown();
	}
	public void setLight(LedLight light) {
		this.light = light;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
