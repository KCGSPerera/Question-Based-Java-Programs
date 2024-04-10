package november_2022_A_01;

public class PermanentEmp extends Employee{
	
	double basicSal;
	double commission;
	
	public PermanentEmp(int id, String name, double basicSal) {
		super(id, name);
		this.basicSal = basicSal;
		this.commission = this.basicSal * (15/100.0);
	}
	
	public double calculateNetSalary() {
		double netSalary = this.basicSal + this.commission;
		return netSalary;
	}
	
	public void display() {
		super.display();
		System.out.println("Basic Salary : " + this.basicSal);
		System.out.println("Commission : " + this.commission);
		System.out.println("Net Salary : " + calculateNetSalary());
	}
	
}
