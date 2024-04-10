package regular_2022_A_02;

// Done and completed.

import java.util.ArrayList;

class TCalculation <T extends Number>{
	ArrayList<T> numList = new ArrayList<>();
	
	public void append(T num) {
		numList.add(num);
	}
	
	public double average() {
		double avg = 0;
		int total = 0;
		
		for (T t : numList) {
			total += t.doubleValue();
		}
		
		for(int i = 0; i < numList.size(); i++) {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			 
		}
		avg = total/numList.size();
		return avg;
	}
}


public class DemoApp {

	public static void main(String[] args) {
		
		TCalculation<Integer> tCalculation1 = new TCalculation<Integer>();
		TCalculation<Double> tCalculation2 = new TCalculation<Double>();
		
		tCalculation1.append(2);
		tCalculation1.append(5);
		tCalculation1.append(3);
		
		tCalculation2.append(2.2);
		tCalculation2.append(4.4);
		tCalculation2.append(8.8);
		
		System.out.println("Average of Integrs : " + tCalculation1.average());
		System.out.println("Average of Doubles : " + tCalculation2.average());
	}

}
