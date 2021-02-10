package models;

public class UndefinedCC extends CreditCard {

	public UndefinedCC(long cardNo, String expDate, String cardHolder) {
		super(cardNo, expDate, cardHolder);
		valid = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Unable to instantiate from known credit types: " + cardNo + "," + expDate + "," + cardHolder;
	}

}
