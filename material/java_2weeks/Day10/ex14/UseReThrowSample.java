public class UseReThrowSample {
	public static void main(String[] args) {
		UseThrowSample s = new UseThrowSample();
		try {
			s.sample();
		} catch (ContractExpirationException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
