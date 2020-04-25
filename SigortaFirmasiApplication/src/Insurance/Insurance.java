package Insurance;

import java.util.Date;

public abstract class Insurance 
{
	protected String name ;
	protected double price;
	protected Date start_Date;
	protected Date finish_Date;
	protected abstract double calculate(double amount);
}
