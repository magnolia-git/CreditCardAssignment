package models;

public class VisaCC extends CreditCard {
	
	public VisaCC(long cardNo, String expDate, String cardHolder) {
		super(cardNo, expDate, cardHolder);
		valid = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Visa: " + cardNo + "," + expDate + "," + cardHolder;
	}
	
	

}
