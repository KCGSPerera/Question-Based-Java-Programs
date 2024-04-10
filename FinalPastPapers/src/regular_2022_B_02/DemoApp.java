package regular_2022_B_02;

// completed.

import java.util.ArrayList;

class MyCalculator <T extends Number>{
	
	ArrayList<T> numberList = new ArrayList<>();
	
	public <T> void  appendNumbers(T val) {
		numberList.add(val);
	}
	
	public double findAverage() {
		
		double avg = 0;
		int total = 0;
		
		for (T t : numberList) {
			total += t.doubleValue();
		}
		avg = total / numberList.size();
		return avg;
	}
}
public class DemoApp {

	public static void main(String[] args) {
		
		MyCalculator<Integer> myCalculator1 = new MyCalculator<Integer>();
		MyCalculator<Double> myCalculator2 = new MyCalculator<Double>();
		
		myCalculator1.appendNumbers(10);
		myCalculator1.appendNumbers(20);
		myCalculator1.appendNumbers(30);
		
		myCalculator2.appendNumbers(1.1);
		myCalculator2.appendNumbers(2.2);
		myCalculator2.appendNumbers(3.3);
		
		myCalculator1.findAverage();
		myCalculator2.findAverage();
		
	}

}
