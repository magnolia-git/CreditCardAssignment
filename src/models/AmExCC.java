package models;

public class AmExCC extends CreditCard {

	public AmExCC(long cardNo, String expDate, String cardHolder) {
		super(cardNo, expDate, cardHolder);
		valid = true;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "AmericanExpress: " + cardNo + "," + expDate + "," + cardHolder;
	}

}
