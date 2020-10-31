package currencyconverter;

public class CurrencyConverter {

	public double dolarPrice;
	public double dollars;
	public static final double iof = 0.06;

	public CurrencyConverter() {

	}

	public CurrencyConverter(double dolarPrice, double dollars) {
		super();
		this.dolarPrice = dolarPrice;
		this.dollars = dollars;
	}

	public double getDolarPrice() {
		return dolarPrice;
	}

	public void setDolarPrice(double dolarPrice) {
		this.dolarPrice = dolarPrice;
	}

	public double getDollars() {
		return dollars;
	}

	public void setDollars(double dollars) {
		this.dollars = dollars;
	}

	public static double getIof() {
		return iof;
	}

	public double amount() {
		return dolarPrice * dollars * (1.0 + iof);
	}
	
	@Override
	public String toString() {
		return "Valor a ser pago R$: " + String.format("%.2f", amount());
	}
	
}
