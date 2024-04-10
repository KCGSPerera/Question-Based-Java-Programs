package november_2022_A_01;

public class TemporaryEmp extends Employee{

	int OtHrs;
	double OtRate;
	double minWage;
	
	public TemporaryEmp(int id, String name, int otHrs, double otRate) {
		super(id, name);
		OtHrs = otHrs;
		OtRate = otRate;
		this.minWage = 15000.00;
	}
	
	public double calculateNetSalary() {
		double netSalary = this.minWage + (this.OtHrs * this.OtRate);
		return netSalary;
	}
	
	public void display() {
		super.display();
		System.out.println("Minimum Wage : " + this.minWage);
		System.out.println("Net Salary : " + calculateNetSalary());
	}
}
