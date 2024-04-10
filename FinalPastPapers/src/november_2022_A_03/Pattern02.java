package november_2022_A_03;

public class Pattern02 extends Thread{

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
