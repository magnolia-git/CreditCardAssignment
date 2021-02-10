package services;
import java.util.ArrayList;
import java.util.List;

import factories.CreditCardFactory;
import models.*;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardFactory factory = new CreditCardFactory();
		List<CreditCard> creditCards = new ArrayList<>();
		String card1 = "5100123412341234,07/22,John Doe";
		String card2 = "601112341234123,09/23,Jane Doe";
		creditCards.add(factory.createCard(card1));
		creditCards.add(factory.createCard(card2));
		
		System.out.println(creditCards.get(0));
		System.out.println(creditCards.get(1));
	}

}
