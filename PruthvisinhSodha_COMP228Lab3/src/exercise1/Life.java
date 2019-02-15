package exercise1;

public class Life extends Insurance{
	
	protected double InsuranceCost;

	public Life()
	{
		super("Life");
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
