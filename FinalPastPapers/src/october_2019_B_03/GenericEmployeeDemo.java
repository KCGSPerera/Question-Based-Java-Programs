package october_2019_B_03;

import java.util.ArrayList;

// Not completed

interface IEmployee{
	
	public String showEmployeeDetails();
}

class Manager implements IEmployee{
	String managerID;
	double salary;
	
	public Manager(String managerID, double salary) {
		super();
		this.managerID = managerID;
		this.salary = salary;
	}
	
	public String showEmployeeDetails() {
		System.out.println("Manager ID : " + this.managerID);
		System.out.println("Salary : " + this.salary);
		
		return managerID;
	}
}


class Engineer implements IEmployee{
	String employeeID;
	String company;
	
	public Engineer(String employeeID, String company) {
		super();
		this.employeeID = employeeID;
		this.company = company;
	}
	
	public String showEmployeeDetails() {
		System.out.println("Employee ID : " + this.employeeID);
		System.out.println("Company : " + this.company);
		
		return employeeID;
	}	
}

class GenericEmployee <T>{
	T id;
	T sal;
	
	public void setVal(T id, T sal) {
		this.id = id;
		this.sal = sal;
	}
	
	public void showElements(T t){
		ArrayList<T> list = new ArrayList<>();
		for (T value : list) {
			System.out.println("Manager ID : " + id + " , Salary : " + sal );
		}
	}
}

public class GenericEmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Engineer> engineers = new ArrayList<>();
		engineers.add(new Engineer("E0000", "IFS"));
		engineers.add(new Engineer("E1111", "Virtusa"));
		engineers.add(new Engineer("E2222", "99x"));
		engineers.add(new Engineer("E3333", "Cambio"));
		engineers.add(new Engineer("E4444", "CodeGen"));
		
		ArrayList<Manager> managers = new ArrayList<>();
		managers.add(new Manager("MGD5555", 250000.00));
		managers.add(new Manager("MG4444", 225000.00));
		managers.add(new Manager("MG3333", 175000.00));
		managers.add(new Manager("MG2222", 200000.00));
		managers.add(new Manager("MG1111", 150000.00));
		
		GenericEmployee genericEmployee = new GenericEmployee();
		genericEmployee.showElements(managers);
		genericEmployee.showElements(engineers);
	}

}
