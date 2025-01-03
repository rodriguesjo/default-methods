package services;

public class BrazilInterestService implements InterestService {

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

	@Override
	public double getInterestRate() {		
		return interestRate;
	}
}
