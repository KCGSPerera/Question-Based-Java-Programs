package Version_F;

import java.util.ArrayList;
import java.util.Scanner;

class InvalidException extends Exception{
	InvalidException(String message){
		super(message);
	}
}

class AlarmClock{
	
	private int Hour;
	private int Minute;
	private int Second;
	
	
	public AlarmClock(){
		
		this.Hour = 12;
		this.Minute = 0;
		this.Second = 0;
		
	}
	
	public void inputAlarm() {
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Enter Hour : " );
			this.Hour = scanner.nextInt();
			
			System.out.println("Enter Minute : " );
			this.Minute = scanner.nextInt();
			
			System.out.println("Enter Second : " );
			this.Second = scanner.nextInt();
			
			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		if(((this.Hour > 12) || (this.Hour < 0)) || ((this.Minute>59) || (this.Minute<0)) || ((this.Second>59) || (this.Second<0))) {
			
			try {
				throw new InvalidException("Invalid Input");
				
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
		
	}
	
	
	
	
	
	public void SetAlarm() {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
		
		System.out.println();
		System.out.println("Alarm 2 : ");
		
		System.out.println("Enter Hour : ");
		this.Hour = sc.nextInt();
		
		System.out.println("Enter Minutes : ");
		this.Minute = sc.nextInt();	
		
		System.out.println("Enter Seconds : ");
		this.Second = sc.nextInt();
		
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		if(((this.Hour > 12) || (this.Hour < 0)) || ((this.Minute>59) || (this.Minute<0)) || ((this.Second>59) || (this.Second<0))) {
			
			try {
				throw new InvalidException("Invalid Input");
				
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	
	
	
	
	public void ShowAlarm() {
		
		System.out.println();
		System.out.println("Showing the set alarm : ");
		System.out.println("Hours : " + this.Hour);
		System.out.println("Minutes : " + this.Minute);
		System.out.println(("Seconds : " + this.Second));
		System.out.println();
	}
}

public class MainApp {
	
	public static void main(String [] args) {
		
		AlarmClock a1 = new AlarmClock();
		AlarmClock a2 = new AlarmClock();
		
		ArrayList<AlarmClock> alm = new ArrayList<AlarmClock>();
		
		alm.add(a1);
		alm.add(a2);
		
		
		for (AlarmClock a : alm) {
			System.out.println(a);
		}
		
		
		a1.inputAlarm();
		a1.ShowAlarm();
		
		a2.SetAlarm();
		a2.ShowAlarm();
	}

}
