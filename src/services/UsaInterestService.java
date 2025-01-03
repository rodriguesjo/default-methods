package services;

public class UsaInterestService implements InterestService{

	private Double interestRate;

	public UsaInterestService(Double interestRate) {		
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
