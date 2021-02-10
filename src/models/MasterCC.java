package models;

public class MasterCC extends CreditCard {

	public MasterCC(long cardNo, String expDate, String cardHolder) {
		super(cardNo, expDate, cardHolder);
		valid = true;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "MasterCard: " + cardNo + "," + expDate + "," + cardHolder;
	}

}
