
public class FullTimeEmployee extends Employee{

	private double monthlySalary;
	
	public FullTimeEmployee(String Name, int Id, double monthlySalary) {
		super(Name, Id); // accessing constructor of superclass 'Employee' with parameters as Name, Id
		this.monthlySalary=monthlySalary;
	}
	
	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}	


