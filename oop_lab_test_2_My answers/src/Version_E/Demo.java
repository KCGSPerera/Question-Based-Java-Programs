package Version_E;


	

	// custom exception
	class InvalidITNumberException extends Exception{
		public InvalidITNumberException(String message) {
			super(message);
		}
	}
	
	

	class Student{
		private String id;
		private String name;
		
		// default constructor
		public Student() {
			this.id = null;
			this.name = null;
		}
		
		
		// overloaded constructor
		public Student(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		// display method
		public void display() {
			
			// handle exception using try catch block
			if((id.length() != 10) || (id.substring(0,2).equals("IT") == false) && id.substring(0,2).equals("it") == false) {
				
				try {
					throw new InvalidITNumberException("Invalid IT number");
								
				} catch (InvalidITNumberException e) {
					System.out.println(e.getMessage());
				}
				
			}
			else {
				System.out.println();
				System.out.println("Name : " + this.name);
				System.out.println("IT Number : " + this.id);
				System.out.println();
			}
			
		}
	}

public class Demo {	
		
		// main program
		public static void main(String [] args) {
			
			Student s =  new Student("IT21889900", "Pasan" );
			s.display();
			
			
		}

}
