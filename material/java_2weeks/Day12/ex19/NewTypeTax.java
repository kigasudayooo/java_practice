public class NewTypeTax extends TaxCalculator {
	@Override
	public int getResult() {
		if (10000 < super.price) {
			int tmp = (int)(10000 * 1.08);
			tmp += (super.price - 10000) * 1.1;
			return tmp;
		}
		return (int)(super.price * 1.08);
	}
}
