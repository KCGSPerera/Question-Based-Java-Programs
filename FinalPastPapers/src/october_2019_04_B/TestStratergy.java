package october_2019_04_B;


interface IFestival{
		
	void performEvent();
	double getBudget();
}

interface Iprograms{
	
	void offerPrograms();
	double getCost();
}

class RoboFest implements IFestival{
	double budget;
	
	public RoboFest() {
		super();
		this.budget = 800000.00;
	}
	public void performEvent() {
		System.out.println("Perform RoboFest event for : " + this.getBudget());
	}
	public double getBudget() {
		return this.budget;
	}
}

class CodeFest implements IFestival{
	double budget;
	
	public CodeFest() {
		super();
		this.budget = 300000.00;
	}
	public void performEvent() {
		System.out.println("Perform CodeFest event for : " + this.getBudget());
	}
	public double getBudget() {
		return this.budget;

	}
}

class GameFest implements IFestival{
	double budget;
	
	public GameFest() {
		super();
		this.budget = 400000.00;
	}
	public void performEvent() {
		System.out.println("Perform GameFest event for : " + this.getBudget());	}
	public double getBudget() {
		return this.budget;

	}
}

class PhDPrograms implements Iprograms{
	double cost;
	
	public PhDPrograms() {
		super();
		this.cost = 6000000.00;
	}
	public void offerPrograms() {
		System.out.println("Offer Phd degree program");
	}
	public double getCost() {
		return this.cost;
	}
}

class MScPrograms implements Iprograms{
	double cost;

	public MScPrograms() {
		super();
		this.cost = 500000.00;
	}
	public void offerPrograms() {
		System.out.println("Offer MSc degree program");
	}
	public double getCost() {
		return this.cost;
	}

}

class BScPrograms implements Iprograms{
	double cost;

	public BScPrograms() {
		super();
		this.cost = 120000.00;
	}
	public void offerPrograms() {
		System.out.println("Offer BSc degree program");
	}
	public double getCost() {
		return this.cost;

	}

}

abstract class Student{
	IFestival iFestival;
	Iprograms iprograms;
	
	public void setFestival(IFestival iFestival) {
		this.iFestival = iFestival;
	}
	public void setPrograms(Iprograms iprograms) {
		this.iprograms = iprograms;
	}
	public void offerPrograms() {
		this.iFestival.performEvent();
	}
	public void conductEvent() {
		this.iprograms.offerPrograms();
	}
	
	public abstract void displayStudents();
	public abstract void displayCost();
	
}

class UnderGraduateStudent extends Student{

	public  void displayStudents() {
		
		offerPrograms();
		conductEvent();
		displayCost();
		System.out.println("Display UnderGraduateStudent student");
	}
	
	public  void displayCost() {
		
		System.out.println("Cost for the underGraduateStudent program is : " + iprograms.getCost());
	}
}

class PostGraduateStudent extends Student{
	
	public  void displayStudents() {
		
		offerPrograms();
		conductEvent();
		displayCost();
		System.out.println("Display PostGraduateStudent student");

	}
	
	public  void displayCost() {
		System.out.println("Cost for the Postgraduate program is : " + iprograms.getCost());
	}
}



public class TestStratergy {

	public static void main(String[] args) {
		Student poStudent = new PostGraduateStudent();
		poStudent.setFestival(new CodeFest());
		poStudent.setPrograms(new MScPrograms());
		poStudent.displayStudents();
		
		System.out.println();
		
		Student unStudent = new UnderGraduateStudent();
		unStudent.setFestival(new RoboFest());
		unStudent.setPrograms(new BScPrograms());
		unStudent.displayStudents();
	}

}
