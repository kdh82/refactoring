package refactoring.statement;

import java.util.List;
import refactoring.dto.Customer;
import refactoring.dto.Rental;

public abstract class Statement {
	
	public String value(Customer customer){
		StringBuilder sb = new StringBuilder();
		//헤더출력
		sb.append(headerString(customer.getName()));
		//본문출력
		List<Rental> rentals = customer.getRentals();
		for(Rental each : rentals){	
			sb.append(eachRentalString(each));		
		}//for loop	
		//푸터출력
		sb.append(footerString(customer));
		return sb.toString();
	}
	protected abstract Object footerString(Customer customer);
	protected abstract Object eachRentalString(Rental each);
	protected abstract Object headerString(String customerName);
}
