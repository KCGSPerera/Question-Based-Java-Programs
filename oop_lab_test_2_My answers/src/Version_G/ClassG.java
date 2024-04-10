package Version_G;

import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

class Employee{
	
	// declare variables
	private String empid;
	private String name;
	private String address;
	
	
	// default constructor
	public Employee() {
		
	}
	
	
	// using overloaded constructor to assign variables
	public Employee(String empid, String name, String address) {
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	
	// read method read values from keyboard
	void read() {
		
		// create Scanner class object to read the values from the keyboard
		Scanner scanner =  new Scanner(System.in);
		
		
		// reading values
		System.out.println("Enter empid : " );
		this.empid = scanner.nextLine();
		
		System.out.println("Enter name : " );
		this.name = scanner.nextLine();
		
		System.out.println("Enter address : " );
		this.address = scanner.nextLine();
		
		// close scanner
		//scanner.close();
			
	}
	
	
	// print method display the employee details.
	void print() {
		System.out.println();
		System.out.println("===Employee Details=== ");
		System.out.println();
		System.out.println("ID : " + this.empid);
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
		System.out.println();
		
	}
}


class Manager extends Employee{
	
	// declare variables
	private int productNo1;
	private int productNo2;
	private int productNo3;
	private String department;
	
	
	// default constructor
	public Manager() {
		
	}
	
	// Assign values using overloaded constructor
	public Manager(String empid, String name, String address, int productNo1, int productNo2, int productNo3, String department) {
		
		// Calling super class constructor
		super(empid, name, address);
		
		this.productNo1 = productNo1;
		this.productNo2 = productNo2;
		this.productNo3 = productNo3;
		this.department = department;
		
	}
	
	
	// read method take user inputs from the keyboard
	void read() {
		
		// calling parent class read() method
		super.read();
		
		// Using try catch block to validate inputs
		try {
			
			Scanner scanner =  new Scanner(System.in);
			
			// reading values
			System.out.println("Enter productNo1 : " );
			this.productNo1 = scanner.nextInt();
			
			System.out.println("Enter productNo2 : " );
			this.productNo2 = scanner.nextInt();
			
			System.out.println("Enter productNo3: " );
			this.productNo3 = scanner.nextInt();
			
			System.out.println("Enter department : " );
			this.department = scanner.nextLine();
			
			//scanner.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	// Print method displays employee details
	void print() {
		
		// calling parent class print() method
		super.print();
		
		System.out.println("ProductNo1 : " + this.productNo1 );
		System.out.println("ProductNo2 : " + this.productNo2 );
		System.out.println("ProductNo3 : " + this.productNo3 );
		System.out.println("Department : " + this.department );
	}
	
}




public class ClassG {
	// main program starts here
	public static void main(String [] args) {
		
		// creating objects
		Employee employee1 = new Employee();
		Manager employee2 =  new Manager();
		
		// calling methods using objects
		employee1.read();
		employee1.print();
		
		employee2.read();
		employee2.print();
		
		
		
	}

}
