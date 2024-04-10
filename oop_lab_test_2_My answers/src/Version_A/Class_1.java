package Version_A;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Class_1 {
	
	// declare lotteryNumbers array
	static int [] lotteryNumbers =  new int[5];
	
	//  declare user number array
	static int [] userNumbers =  new int [5];
	
	
	
	
	
	// Class_1 default constructor
	public Class_1() {
		
		Random random =  new Random();
		
		
		
		
		// store 5 random numbers in array
		for(int i = 0; i < 5; i++) {
			
			lotteryNumbers[i] = random.nextInt(10);
		}
		
		
		
	}
	
	
	
	// function to compare input numbers and random numbers
	public void compareLottery() {
		
		
		
		
		// define variable
		int num = 0; 								 
		
		
		// define Scanner class object
		Scanner sc =  new Scanner(System.in); 		
		
		
		
		
		// taking user inputs using for loop
		for(int i = 0; i < 5; i++) {
						
		System.out.print("Enter positive Integer " + ++num + " : " );
		userNumbers[i] = sc.nextInt();			
		}
		System.out.println();
		
		// close Scanner class object
		sc.close(); 
		
		// Display user input numbers
		System.out.print("Display randomly generated numbers : ");
						
						
						
		for(int i = 0; i < 5; i++) {
							
			System.out.print(userNumbers[i]);
							
			if(i == 4) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		// Display randomly generated numbers
		System.out.print("Display randomly generated numbers : ");
				
				
				
		for(int i = 0; i < 5; i++) {
					
			System.out.print(lotteryNumbers[i]);
					
			if(i == 4) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println();
				
		
		
		// declare  increment variable
		int count = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// compare two arrays
		for(int i = 0; i < 5; i++) {
						
			if(lotteryNumbers[i] == userNumbers[i]) {
				count++;
				list.add(userNumbers[i]);
			}
		}	
		System.out.println();
			
		// display matching count
		System.out.println("Matching numbers count : " + count );
		System.out.println();
		 
		// display matching numbers
		System.out.print("Matching numbers : ");
				
		for (Integer val : list) {
			System.out.print(val + " ");
			
		}
		
		
	}
	
	
	
	// main program
	public static void main(String [] args) {
		
		Class_1 obj = new Class_1();
		obj.compareLottery();
		
		
				
	}
	

}
