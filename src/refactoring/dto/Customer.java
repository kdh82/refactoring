package refactoring.dto;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals;
	
	
	public Customer(String name) {
		this.name = name;
		this.rentals = new ArrayList<>();
	}

	public String getName() {
		return name;
	}
	
	public void addRental(Rental aRental){
		this.rentals.add(aRental);
		
	}
	
	public String statment(){
		//대여료와 적립포인트 출력
		double totalAmount=0; //대여료
		int frequentRenterPoints =0; //적립포인트 지역변수는 클래스다이어그램안함
		StringBuilder sb = new StringBuilder();
		sb.append(getName()+"고객님의 대여기록 \n"); //고객명
		for(Rental each : rentals){
			frequentRenterPoints += each.getfrequentRenterPoints();
			
			sb.append(String.format("\t%s \t %s%n", each.getMovie().getTitle(),each.getCharge()));
			totalAmount += each.getCharge();
		}//for loop
		
		sb.append(String.format("누적 대여료: %s%n 적립포인트: %s%n", totalAmount, frequentRenterPoints));

		return sb.toString();
	}	
}
