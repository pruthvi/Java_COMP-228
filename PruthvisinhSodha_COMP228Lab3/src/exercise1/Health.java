package exercise1;

public class Health extends Insurance{
	
	protected double InsuranceCost;

	public Health()
	{
		super("Health");
		setInsuranceCost();

	}

	public void setInsuranceCost()
	{
		monthlyCost = InsuranceCost;
	}

	public void displayInfo()
	{
		System.out.println(monthlyCost);
	}
}
