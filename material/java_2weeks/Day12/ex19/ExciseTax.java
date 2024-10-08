public class ExciseTax extends TaxCalculator {
	@Override
	public int getResult() {
		int result = (int)(super.price * 1.08);
		return result;
	}
}
