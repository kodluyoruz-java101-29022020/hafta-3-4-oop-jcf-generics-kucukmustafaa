package Insurance;

public class HealthInsurance extends Insurance{

	private final double healthInsurance;
	
	public HealthInsurance() {
		this.healthInsurance=0.8; 
	}
	@Override
	protected double calculate(double amount) {
		return this.healthInsurance*amount;
	}

}
