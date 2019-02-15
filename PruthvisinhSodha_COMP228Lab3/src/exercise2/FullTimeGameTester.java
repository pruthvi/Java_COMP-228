package exercise2;

public class FullTimeGameTester extends GameTester{

	
	//Constructor
	public FullTimeGameTester (String newTester, Boolean newStatus, int newSalary)
	{
		super(newTester, newStatus, newSalary);
		
	}
	

	
	@Override
	public int setSalary(int salary)
	{
		salary = 3000;
		return salary;
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}

}
