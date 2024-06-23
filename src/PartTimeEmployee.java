
public class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String Name, int Id, int hoursWorked, double hourlyRate) {
		super(Name, Id);// accessing constructor of superclass 'Employee' with parameters as Name, Id
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}
