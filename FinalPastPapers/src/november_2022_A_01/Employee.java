package november_2022_A_01;

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
