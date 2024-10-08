public class Calculator {
	private TaxCalculator taxCal;
	private int price;
	private int qty;
	public void setTaxCal(TaxCalculator taxCal) {
		this.taxCal = taxCal;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getResult() {
		if (this.taxCal != null) {
			taxCal.setPrice(price * qty);
			return taxCal.getResult();
		}
		return price * qty;
	}
}
