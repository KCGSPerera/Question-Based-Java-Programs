package ex02;

public class Ex2 {

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		ex2.printDetails("Age is : ", 23);
		ex2.printDetails("Name is : ", "Gavithra");
		ex2.printDetails("Salary is : ", 250000.00);

	}
	
	
	public <E> void printDetails(String msg, E val) {
		System.out.println(msg + " " + val );
	}

}
