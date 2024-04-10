package november_2022_A_03;


public class Pattern01 extends Thread{
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
}
