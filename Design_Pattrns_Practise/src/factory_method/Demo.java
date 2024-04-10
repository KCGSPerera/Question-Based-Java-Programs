package factory_method;



interface IColor{
	void fill();
	
}

class LightRed implements IColor{
	public void fill() {
		System.out.println("Fill in Light Red color");
	}
}

class LightGreen implements IColor{
	public void fill() {
		System.out.println("Fill in Light Green color");
	}	
}

class LightBlue implements IColor{
	public void fill() {
		System.out.println("Fill in Light Blue color");
	}
}

class DarkRed implements IColor{
	public void fill() {
		System.out.println("Fill in Dark Red color");
	}
}

class DarkGreen implements IColor{
	public void fill() {
		System.out.println("Fill in Dark Green color");
	}	
}

class DarkBlue implements IColor{
	public void fill() {
		System.out.println("Fill in Dark Blue color");
	}
}

abstract class ColorSelection{
	public abstract  IColor getColor(String type);
}


class LightColorFactory extends ColorSelection{
	public IColor getColor(String type) {
		if(type.equals("red")) {
			return new LightRed();
		}
		else if(type.equals("green")) {
			return new LightGreen();
		}
		else {
			return new LightBlue();
		}
	}
}

class DarkColorFactory extends ColorSelection{
	public IColor getColor(String type) {
		if(type.equals("red")) {
			return new DarkRed();
		}
		else if(type.equals("green")) {
			return new DarkGreen();
		}
		else {
			return new DarkBlue();
		}
	}
}

public class Demo {
	public static void main(String []args) {
		
		ColorSelection lightColor = new LightColorFactory();
		lightColor.getColor("red").fill();
		
		ColorSelection darkColor = new DarkColorFactory();
		darkColor.getColor("green").fill();
		
	}

}


