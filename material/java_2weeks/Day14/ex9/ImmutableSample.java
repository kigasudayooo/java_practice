public final class ImmutableSample {
	private final String name;
	public ImmutableSample(String name) {
		this.name = name;
	}
	public void greet() {
		System.out.println("hello, " + name);
	}
}
