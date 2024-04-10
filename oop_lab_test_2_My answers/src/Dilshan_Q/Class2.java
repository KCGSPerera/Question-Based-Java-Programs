package Dilshan_Q;


	
	
	
	 
	
	import java.util.Scanner;//import scanner library function


	class NoPositiveIntegersException extends Exception{ //craete new exception
		public NoPositiveIntegersException(String message) {
			super(message);
		}
	}

	/*
	 
	 
	 class AveragePositiveIntegersException extends Exception { //create new exception
		 public AveragePositiveIntegersException (String message) {
				super(message);
			}
	}
	
	*/

	class Number{ 
		 int [] posNumber; //initialzed type
	 
	 
	 public Number(int [] posNumber){//create a constructor
		 
		 this.posNumber = new int[10];
		 
		 for(int i = 0; i < 10; i++) {
			 
			 this.posNumber[i] = posNumber[i];
		 }
		 this.posNumber = posNumber; 
	 }
	 
	 
	 
	 
	 public void print() {
		 
		
		 
		 float avg = 0;
		 int sum = 0;
		 
		 System.out.println();
		 System.out.print("Positive numbers : ");
		 for(int i = 0; i < 10; i++) {
			 
			 if(this.posNumber[i] > 0) {
				 
				 System.out.print(" " + posNumber[i]);
				 if(i == 9)
					 continue;
				 System.out.print(", ");
				 
			 }else if(posNumber[i] <= 0) {
				 continue;
			 }
			
		 }
		
	 	}
	 }
	 
	
	
	
	 public class Class2{
		 
		 public static void main (String[] args) {
			 
			 int  [] poNumber =  new int[10];
			 
			 Scanner scanner = new Scanner(System.in); //scanner
			 
			 for(int i = 0; i < 10; i++) {
				 
				 System.out.print("Enter the Number : ");
				 poNumber[i] = scanner.nextInt();
				 
			 }
			 
			
			 
			 
			 for(int i = 0; i < 10; i++) {
				 
				 if(poNumber[i] <= 0) {
					 try {					 
						throw new  NoPositiveIntegersException("There are no positive integers in the list");
							
						}catch(NoPositiveIntegersException e){
							e.printStackTrace();
						}
					 
					}
				 
			 }
			
			
			 
			 Number num = new Number(poNumber);
			 num.print();
			
			
		 }
	 }



