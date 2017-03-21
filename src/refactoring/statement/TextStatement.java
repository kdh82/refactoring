package refactoring.statement;

import refactoring.dto.Customer;
import refactoring.dto.Rental;

public class TextStatement extends Statement {
	
	@Override
	protected Object footerString(Customer customer) {
		return String.format("누적 대여료: %s%n 적립포인트: %s%n", customer.getTotalCharge(), customer.getTotalFrequentRenterPoints());
	}
	@Override
	protected Object eachRentalString(Rental each) {		
		return String.format("\t%s \t %s%n", each.getMovie().getTitle(),each.getCharge());	
	}
	@Override
	protected Object headerString(String customerName) {	
		return customerName+"고객님의 대여기록 \n"; //고객명;
	}
}

