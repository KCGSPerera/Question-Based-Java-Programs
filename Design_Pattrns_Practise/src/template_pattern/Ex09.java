package template_pattern;

abstract class Template{
	
	final void template() {
		start();
		service();
		stop();
	}
	
	abstract void start();
	abstract void service();
	abstract void stop();
}


class MyLifeCycle extends Template{
	
	public void start() {
		System.out.println("start");
	}
	
	public void service() {
		System.out.println("service");
	}
	
	public void stop() {
		System.out.println("stop");
	}
}


public class Ex09 {

	public static void main(String[] args) {

		Template temp = new MyLifeCycle();
		temp.template();
	}

}
