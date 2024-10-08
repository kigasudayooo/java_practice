public class ThrowSample {
	public void test(String val) throws ContractExpirationException {
		if (val == null) {
			throw new ContractExpirationException("sample");
		}
	}
}
