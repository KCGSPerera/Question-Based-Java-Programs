package test2;

// Completed. but not running.

import java.util.ArrayList;

abstract class Employee {
	int id; 
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("ID : " + this.id);
		System.out.println("Name : " + this.name);
	}
	
	abstract double calculateNetSalary();

}


class PermanentEmp extends Employee{
	
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


class TemporaryEmp extends Employee{

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


public class DemoApp {

	public static void main(String[] args) throws Exception {
		PermanentEmp perEmployee1 = new PermanentEmp(101, "Nimali", 56000.00);
		PermanentEmp perEmployee2 = new PermanentEmp(102, "Amal", 74000.00);
		
		ArrayList<PermanentEmp> list1 = new ArrayList<>();
		list1.add(perEmployee1);
		list1.add(perEmployee2);
		
		perEmployee1.calculateNetSalary();
		perEmployee2.calculateNetSalary();

		TemporaryEmp temEmployee1 = new TemporaryEmp(201, "Sunil", 10, 500.00);
		TemporaryEmp temEmployee2 = new TemporaryEmp(201, "Sunil", 10, 500.00);
		
		ArrayList<TemporaryEmp> list2 = new ArrayList<>();
		list2.add(temEmployee1);
		list2.add(temEmployee2);
		
		temEmployee1.calculateNetSalary();
		temEmployee2.calculateNetSalary();

	}

}
