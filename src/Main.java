
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payroll payrollsystem = new Payroll();
		FullTimeEmployee emp1 = new FullTimeEmployee("Dheyu", 1, 60000);
		PartTimeEmployee emp2 = new PartTimeEmployee("Sayali", 2, 40, 50);
		payrollsystem.addEmployee(emp1);
		payrollsystem.addEmployee(emp2);
		System.out.println("Display all employees");
		payrollsystem.displayEmployee();
		System.out.println("Removing some employee");
		payrollsystem.removeEmployee(2);
		System.out.println("Display remaining employees");
		payrollsystem.displayEmployee();
	}

}
