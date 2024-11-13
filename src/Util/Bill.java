package Util;

public class Bill {

	public static final double beearPrice = 5.00;
	public static final double barbecuePrice = 7.00;
	public static final double softdrinkPrice = 3.00;
	public static final double menPrice = 10.00;
	public static final double womenPrice = 8.00;

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double Feeding() {

		return beer * beearPrice + barbecue * barbecuePrice + softDrink * softdrinkPrice;
	}

	public double Cover() {
		if (Feeding() > 30.00) {
			return 0;
		}

		else {
			return 4.00;
		}
	}

	public double Ticket() {
		if (gender == 'M') {
			return menPrice;
		} else {
			return womenPrice;
		}
	}

	public double Total() {

		return Feeding() + Cover() + Ticket();
	}
}
