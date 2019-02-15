package exercise1;

public abstract class Insurance {

	protected String insuranceType;
	protected double monthlyCost;
	
	public Insurance(String type)
	{
		insuranceType = type;
	}

	public String getInsuranceType()
	{
		return insuranceType;
	}

	public double getMonthlyCost()
	{
		return monthlyCost;
	}

	public abstract void setInsuranceCost();
	public abstract void displayInfo();
	
}

