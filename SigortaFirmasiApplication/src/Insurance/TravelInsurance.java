package Insurance;

public class TravelInsurance extends Insurance{

	private final double travelInsurance;
	
	public TravelInsurance() {
		this.travelInsurance=0.67;
	}
	
	@Override
	protected double calculate(double amount) {
		return this.travelInsurance*amount;
	}

}
