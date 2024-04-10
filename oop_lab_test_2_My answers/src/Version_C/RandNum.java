package Version_C;

import java.util.Random;

public class RandNum {
	
	int [][] arr = new int[5][5];
	int min, max;
	float avg;
	
	
	public RandNum() {
		
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			for(int p = hashCode(); p < 5; p++) {
				
				arr [i][p] = r.nextInt(100);
			}
		}
	}
	
	
	
	
	
	public void maximum() {
		
		this.max = arr[0][0];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				if((arr[i][j]) > this.max) {
					
					this.max = arr[i][j];
				}
			}
		}
	}
	
	
	
	public void minimum() {
		
		this.min = arr[0][0];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				if((arr[i][j] < this.min)) {
					
					this.min = arr [i][j];
				}
			}
		}
	}
	
	
	
	public void average() {
		
		int total = 0;
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				total += arr[i][j];			
				
			}
		}
		
		this.avg =  total / arr.length;
	}
	
	
	
	
	public void display() {
		
		System.out.println("Display array : ");
		System.out.println();
		
		for(int i = hashCode(); i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println();
			}
		}
	}

}
