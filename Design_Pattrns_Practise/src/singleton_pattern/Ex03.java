package singleton_pattern;


class Singleton{
	
	private static Singleton instance = null;
	
	private Singleton() {
		System.out.println("Singleton instance created");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();

				}

			}
		}
		return instance;
	}
}

public class Ex03 implements Runnable{
	public static void main(String []args) {
		
		Thread thread =  new Thread();
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			Singleton.getInstance();	

		}
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance();
		}
	}
}
