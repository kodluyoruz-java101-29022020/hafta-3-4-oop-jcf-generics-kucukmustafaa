package Insurance;

public class ResidenceInsurance extends Insurance{

	
	private final double residenceInsurance;
	
	public ResidenceInsurance() {
		this.residenceInsurance=0.53;
	}
	
	@Override
	protected double calculate(double amount) {
		return this.residenceInsurance*amount;
	}
	
	

}
