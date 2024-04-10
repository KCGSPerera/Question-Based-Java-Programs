package november_2022_B_01;

// completed

import java.util.ArrayList;
import java.util.Scanner;

abstract class Customer{
	int id;
	String name;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		
		System.out.println("Id : " + this.id);
		System.out.println("name : " + this.name);
	}
	
	abstract double calculateBill();
		
}

class RegisteredCus extends Customer{
	double rewardPoints;
	double netAmount;
	
	public RegisteredCus(int id, String name) {
		super(id, name);
		this.rewardPoints = 0;
		this.netAmount = 0;
	}
	
	public double calculateBill(){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Bill amount : ");
		double amt = scanner.nextDouble();
		
		
		if(amt > 950.00) {
			this.rewardPoints += ( amt * 15 / 100.0 );
		}
		double discount = (amt * 7 / 100.0);
		this.netAmount = amt - discount;
		
		return this.netAmount;
	}
	
	@Override
	public void display() {
		super.display();
		
		calculateBill();
		System.out.println("Reward Points : " + this.rewardPoints);
		System.out.println("Net Amount : " + this.netAmount);
		
	}
}


public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<>();
		
		Customer customer1 = new RegisteredCus(101, "Kamal");
		Customer customer2 = new RegisteredCus(105, "Sunil");
		
		list.add(customer1);
		list.add(customer2);
		
		for(Customer value : list) {
			value.display();
			System.out.println();
		}
		
	}

}
