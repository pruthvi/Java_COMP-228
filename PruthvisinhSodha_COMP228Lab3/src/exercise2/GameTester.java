package exercise2;

public abstract class GameTester {

	protected String tester;
	protected Boolean status;
	protected int salary;
	
	//Constructor
	public GameTester (String newTester, Boolean newStatus, int newSalary)
	{
		this.tester = newTester;
		this.salary = newSalary;
		this.status = newStatus;
		
	}
	
	
	// abstract method for salary
		public abstract int setSalary(int salary);
		
		
		@Override
		public String toString()
		{
			return (this.tester + ", " + this.status + "," + this.salary);
		}
}
