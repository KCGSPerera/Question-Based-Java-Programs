package october_2019_A_03;


class PlusThred extends Thread{
	
	private Object lock = new Object();
	int start;
	int range;
	
	public PlusThred(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	public void addNumbers(Object lock, int start, int range) {
		synchronized (lock) {
		
			for(int i = start; i <= range; i++ ) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " => " + i + " + " + i + " = " + (i+i));
				lock.notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void run() {
		
		addNumbers(lock, start, range);
	}
}

class MultiplyThread extends  Thread{
	
	private Object lock = new Object();
	int start;
	int range;
	
	public MultiplyThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;		
	}

	public void multiplyNumbers(Object lock, int start, int range) {
		synchronized (lock) {
			
		
		for(int i = start; i <= range; i++ ) {
			System.out.println(Thread.currentThread().getName() + " => " + i + " * " + i + " = " + (i*i));
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
	
	
	public void run() {
		multiplyNumbers(lock, start, range);
	}
	
}

public class TestThreads {

	public static void main(String[] args) {
		
		TestThreads testThreads = new TestThreads();
		
		PlusThred plusThread = new PlusThred(testThreads, 2, 10);
		plusThread.setName("Thread-0");
		plusThread.start();
		
		MultiplyThread multiplyThread = new MultiplyThread(testThreads, 2, 10);
		multiplyThread.setName("Thread-1");
		multiplyThread.start();
	}

}
