package november_2022_B_03;

import java.util.Scanner;

class Pattern01 extends Thread{
	
	Object lock; //= new Object();
	String pattern;
	private int count;
		
	public Pattern01(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}


	public void run() {
		synchronized(lock) {
			
			for(int i = 1; i <= count; i++) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(Thread.currentThread().getName() + " = " );
				for(int r = count; r >= 1; r--) {
					System.out.print(pattern);
				}
				count--;
				System.out.println();
				lock.notify();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


class Pattern02 extends Thread{
	
	Object lock; // = new Object();
	String pattern;
	private int count;
		
	public Pattern02(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}


	public void run() {
		synchronized(lock) {
			
			for(int i = 1; i <= count; i++) {
				System.out.print(Thread.currentThread().getName() + " = " );
				for(int r = count; r >= 1; r--) {
					System.out.print(pattern);	
				}
				count--;
				System.out.println();
				lock.notify();
				try {
					lock.wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		//Main main = new Main();
		Object lock = new Object();
		
		int count = 0;
		String pattern1 = null;
		String pattern2 = null;

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Count : " );
		count = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Pattern 1 : ");
		pattern1 = scanner.nextLine();
		
		System.out.println("Enter Pattern 2 : ");
		pattern2 = scanner.nextLine();
		
		scanner.close();
				
		Pattern01 pattern01 = new Pattern01(lock, pattern1, count);
		pattern01.setName("Pattern01");
		pattern01.start();
		
		Pattern02 pattern02 = new Pattern02(lock, pattern2, count);
		pattern02.setName("Pattern02");
		pattern02.start();
		
	}

}
