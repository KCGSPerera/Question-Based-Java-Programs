package test3;

import java.util.Scanner;

class Pattern01 extends Thread{
	private Object lock = new Object();
	String pattern;
	int count;
		
	public Pattern01(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}


	public void run() {
		synchronized (lock) {
		
		for(int i = 1; i <= count; i++ ) {
			
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(Thread.currentThread().getName() + " = " );
			
			for(int r = 1; r <= i; r++) {
				System.out.print(this.pattern + " ");
			}
			System.out.println();
			lock.notify();
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
  }
	
 class Pattern02 extends Thread{

		private Object lock = new Object();
		String pattern;
		int count;
			
		public Pattern02(Object lock, String pattern, int count) {
			super();
			this.lock = lock;
			this.pattern = pattern;
			this.count = count;
		}


		public void run() {
			synchronized (lock) {
			
			for(int i = 1; i <= count; i++ ) {
				
				System.out.print(Thread.currentThread().getName() + " = " );
				
				for(int r = 1; r <= i; r++) {
					System.out.print(this.pattern + " ");
				}
				System.out.println();
				lock.notify();
				try {
					lock.wait();
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	  }
	}
	
	
public class Main {

public static void main(String[] args) {
		
		int count;
		String p1;
		String p2;
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pattern 1 : ");
		p1 = scanner.nextLine();
		
		System.out.println("Enter pattern 2 : ");
		p2 = scanner.nextLine();
		
		System.out.println("Enter iteration count : ");
		count = scanner.nextInt();
		
		Object lock = new Object();
		
		Pattern01 pattern01 = new Pattern01(lock, p1, count);
		pattern01.setName("Pattern 01 Thread");
		pattern01.start();
		
		Pattern02 pattern02 = new Pattern02(lock, p2, count);
		pattern02.setName("Pattern 02 Thread");
		pattern02.start();
		
		scanner.close();
		
	}
}
}
