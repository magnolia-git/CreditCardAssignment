package models;

public class DiscoverCC extends CreditCard {

	public DiscoverCC(long cardNo, String expDate, String cardHolder) {
		super(cardNo, expDate, cardHolder);
		valid = true;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Discover: " + cardNo + "," + expDate + "," + cardHolder;
	}

}
