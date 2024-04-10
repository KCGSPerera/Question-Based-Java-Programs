package simple_factory;

interface IColor{
	void fill();
	
}

class Red implements IColor{
	public void fill() {
		System.out.println("Fill in Red color");
	}
}

class Green implements IColor{
	public void fill() {
		System.out.println("Fill in Green color");
	}	
}

class Blue implements IColor{
	public void fill() {
		System.out.println("Fill in Blue color");
	}
}

class ColorFactory{
	public static IColor getColor(String type) {
		if(type.equals("red")) {
			return new Red();
		}
		else if(type.equals("green")) {
			return new Green();
		}
		else {
			return new Blue();
		}
	}
}

public class Demo {
	public static void main(String []args) {
		
		ColorFactory.getColor("red").fill();
		ColorFactory.getColor("green").fill();
		ColorFactory.getColor("blue").fill();
		
	}

}

