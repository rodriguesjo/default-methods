package services;

import java.security.InvalidParameterException;

public class BrazilInterestService {

	private Double interestRate;

	public BrazilInterestService(Double interestRate) {		
		this.interestRate = interestRate;
	}

	public Double getInterestService() {
		return interestRate;
	}

	public void setInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow((1 + interestRate / 100), months); 
	}
}
