package refactoring.statement;

import refactoring.dto.Customer;
import refactoring.dto.Rental;

public class HtmlStatement extends Statement {
	@Override
	protected Object footerString(Customer customer) {
		return String.format("<p>누적 대여료: <em>%s</em>%n<p> 적립포인트: <em>%s</em>%n", customer.getTotalCharge(), customer.getTotalFrequentRenterPoints());
	}
	@Override
	protected Object eachRentalString(Rental each) {
		return String.format("%s %s<br>%n", each.getMovie().getTitle(),each.getCharge());
	}
	@Override
	protected Object headerString(String customerName) {	
		return "<h1><em>"+customerName+"고객님의 대여 기록 </em></h1><p>\n";
	}
}
