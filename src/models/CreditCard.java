package models;

public abstract class CreditCard {
	
	long cardNo;
	String expDate;
	String cardHolder;
	boolean valid;
	
	
	public CreditCard(long cardNo, String expDate, String cardHolder) {
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.cardHolder = cardHolder;
	}
	
	
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	
	

}
