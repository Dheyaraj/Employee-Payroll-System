
public abstract class Employee {

		private String Name;
		private int Id;
		
		public Employee(String Name, int Id) {
			this.Name = Name;
			this.Id = Id;
		}
		
		public String getName() {
			return Name;
		}
		
		public int getId() {
			return Id;
		}
		
		public abstract double calculateSalary(); // abstract method
		@Override // Overriding toString method from Java Class toString
		public String toString(){
			return "Employee{Name = " + Name +", Id = "+ Id +", Salary = " + calculateSalary() + "}";
		}
	}


