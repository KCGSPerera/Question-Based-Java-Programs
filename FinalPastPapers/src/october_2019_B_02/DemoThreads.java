package october_2019_B_02;

class AddNumbers extends Thread{
	DemoThreads demoThreads;
	int begin;
	int end;
	
	
	public AddNumbers(DemoThreads demoThreads,int begin, int end) {
		super();
		this.demoThreads = demoThreads;
		this.begin = begin;
		this.end = end;
		
	}	
	
	public void addNumbers(DemoThreads demoThreads, int begin, int end) {
		synchronized (demoThreads) {
			
		
		for(int i = begin; i <= end; i++) {
			
			try {
				demoThreads.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " => "+ i + " + " + i + " = " + (i+i));
			demoThreads.notify();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
	
	public void run() {
		addNumbers(demoThreads, begin, end);
	}
		
}

class MultiplyNumbers extends Thread{
	private Object lock = new Object();
	DemoThreads demoThreads;
	int begin;
	int end;
	
	public MultiplyNumbers(DemoThreads demoThreads, int begin, int end) {
		super();
		this.demoThreads = demoThreads;
		this.begin = begin;
		this.end = end;	
	}
	
	public void multiplyNumbers(Object lock, DemoThreads demoThreads, int begin, int end) {
		synchronized (demoThreads) {
			for(int i = begin; i <= end; i++) {
				System.out.println(Thread.currentThread().getName() + " => " + i + " * " + i + " = " + (i*i) );
				
				demoThreads.notify();
				try {
					demoThreads.wait();
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public void run() {
		multiplyNumbers(lock, demoThreads, begin, end);
	}
	
	
}


public class DemoThreads {

	public static void main(String[] args) {
		
		DemoThreads demoThreads = new DemoThreads();
		Thread addNumbers = new Thread(new AddNumbers(demoThreads, 10, 20), "ADD");
		Thread multiplyNumbers = new Thread(new MultiplyNumbers(demoThreads, 10, 20), "MUL");
		addNumbers.start();
		multiplyNumbers.start();
	}

}
