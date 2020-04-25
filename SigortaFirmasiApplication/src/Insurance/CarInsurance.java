package Insurance;

public class CarInsurance extends Insurance{

	private final double carInsurance;
	
	public CarInsurance() {
		this.carInsurance=0.93;
	}
	
	@Override
	protected double calculate(double amount) {
		// TODO Auto-generated method stub
		return this.carInsurance*amount;
	}

}
