package regular_2022_A_03;

// completed
// Producer Consumer Problem


import java.util.ArrayList;

class ProducerBuffer extends Thread{
	
	ArrayList<Integer> queue = new ArrayList<>();
	int maxSize;
	
	
	public ProducerBuffer(ArrayList<Integer> queue, int maxSize) {
		super();
		this.queue = queue;
		this.maxSize = maxSize;
	}


	public void run() {
		
		synchronized (queue) {
			
			
			int num = 0;
			
			while(queue.size()==this.maxSize) {
				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			while(queue.size()< maxSize) {
				
				num+=10;
				
				System.out.println("Producer Started");
				System.out.println("Producer adding value " + num + " to queue");
				System.out.println("Elements in Queue [] ");

				
				queue.add(num);
				queue.notify();
				try {
					queue.wait();
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
		}
			
	}
}

class ConsumerBuffer extends Thread{
	
	ArrayList<Integer> queue = new ArrayList<>();
	
	
	
	public ConsumerBuffer(ArrayList<Integer> queue) {
		super();
		this.queue = queue;
	}



	public void run() {
		synchronized (queue) {
			
			while(queue.size() == 0) {
				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			while(queue.size() > 0 ) {
				
				System.out.println("Consumer started");
				int num = queue.remove(queue.size()-1);
				System.out.println("Consumer Thread consumes " + num + " to queue");
				System.out.println("Elements in Queue [] ");
				
				queue.notify();
				
				try {
					queue.wait();
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> queue = new ArrayList<>();
		
		Thread producer = new ProducerBuffer(queue, 5);
		Thread consumer = new ConsumerBuffer(queue);
		
		producer.start();
		consumer.start();
		
		System.out.println("Starting ");
	}

}
