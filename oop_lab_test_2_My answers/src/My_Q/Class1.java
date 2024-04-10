package My_Q;

import java.util.Scanner;

import javax.imageio.metadata.IIOInvalidTreeException;




class InvalidException extends Exception{
	public InvalidException(String message) {
		super(message);
	}
	
}


class Details {
	
	int age;
	String name;
	
	
	public Details() {
		this.age = 0;
		this.name = null;
	}
	
	public void setDetails(String name, int age) {
		
		this.age = age;
		this.name = name;
		
	}
	
	
	
	void displayDetails() {
		
		System.out.println("Hello " + this.name + " your age is " + this.age );
	}
	
	
	
}


public class Class1 {
	
	public static void main(String [] args) {
		
		
		
		int age;
		String name;
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter age : " );
		age = scanner.nextInt();
		
		System.out.println("Enter name : " );
		name =  scanner.nextLine();
		
		scanner.close();
		
		if((age < 0 ) || (age > 120)) {
			
			try {
				throw new InvalidException("Invalid age, please enter a valid age.");
				
			}catch (InvalidException e) {
				System.out.println(e.getMessage());
				
			}
				
		}
		
			
		Details details = new Details();
		
		details.setDetails(name, age);
		details.displayDetails();
		
			
			
	}
		
		

}
