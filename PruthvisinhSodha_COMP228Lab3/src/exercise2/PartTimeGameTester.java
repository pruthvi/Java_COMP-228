package exercise2;

public class PartTimeGameTester extends GameTester{

	
	//Constructor
	public PartTimeGameTester (String newTester, Boolean newStatus, int newSalary)
	{
		super(newTester, newStatus, newSalary);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public int setSalary(int salary)
	{
		
		salary = salary * 20;
		return salary;
	}
	
}
