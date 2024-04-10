package Yasith_Q;

import java.util.ArrayList;
import java.util.Scanner;



class ArrayListOperations1{
	
	
	
	ArrayList<Integer> list =  new ArrayList<>();
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	public ArrayListOperations1() {
		this.list = null;
	}
	
	for(int i = 0; i < 5; i++) {
		
		System.out.println("Enter positive integer : " );
		
		int no = scanner.nextInt();
		list.add(no);
	}
	
	public void removeOddNumbers() {
		
		System.out.println();
		System.out.print("Odd numbers : ");
		for (Integer odd : list) {
			
			if(odd % 2 == 1){
				System.out.println(odd + " ,");
			}
			
		} 
		
		System.out.println();
		System.out.print("Even numbers : ");
		for (Integer even : list) {
			if(even % 2 == 0) {
				System.out.println(even + " ,");
			}
			
		}
		
	}
	
}



public class TestOperations {
	
	public static void main(String [] args) {
		
		ArrayListOperations1 arr = new ArrayListOperations1();
		
		arr.removeOddNumbers();
	}

}
