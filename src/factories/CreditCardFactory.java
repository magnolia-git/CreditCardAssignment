package factories;

import models.*;

public class CreditCardFactory {
	
	public CreditCard createCard(String card) {
		String[] str = card.split(",");
		
		if (str.length != 3) return new UndefinedCC(0l, "null", "null");
		
		else if (str[0].length() > 19) return new UndefinedCC(0l, "null", "null");
		
		
		long cardNo = Long.parseLong(str[0]);
		String expDate = str[1];
		String cardHolder = str[2];
		String discDigits = str[0].substring(0, 4);
		

			//If it's greater than 19, then it creates an unverified card.
		

		
			//MasterCard...
			// If first digit is 2 or 5 AND second digit is 1 to 5 AND length is 16 digits
			if ((str[0].charAt(0) == '2' || str[0].charAt(0) == '5') && 
					(str[0].charAt(1) <= '5' && str[0].charAt(1) > '0') && str[0].length() == 16 ) {
				return new MasterCC(cardNo, expDate, cardHolder);
			}
			
			//Visa...
			// If first digit is 4 AND (length is 13 OR length is 16)
			else if( str[0].charAt(0) == '4' && (str[0].length() == 13 || str[0].length() == 16) ) {
	            return new VisaCC(cardNo, expDate, cardHolder);
	        }
			
			//AmericanExpress...
	        // If 1st digit is 3 AND (2nd digit is 4 or 7) AND length is 15 digits
			else if( str[0].charAt(0) == '3' && ( str[0].charAt(1) == '4' || str[0].charAt(1) == '7' ) &&
	                str[0].length() == 15) {
	            return new AmExCC(cardNo, expDate, cardHolder);
	        }

			//Discover...
	        // If first 4 digits are 6 0 1 1 && length is 16
			else if( discDigits.contentEquals("6011") && str[0].length() == 16) {
	            return new DiscoverCC(cardNo, expDate, cardHolder);
	        }

	        // Create an unidentified card. Could be handled by the bank to fix it.
			else {
				return new UndefinedCC(cardNo, expDate, cardHolder);
			}

		
	}
	
}
