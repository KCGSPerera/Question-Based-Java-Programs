package abstract_factory;

interface Color{
	void fill();
	
}

interface Shape{
	void draw();
}

class Red implements Color{
	public void fill() {
		System.out.println("Fill in Red color");
	}
}

class Green implements Color{
	public void fill() {
		System.out.println("Fill in Green color");
	}	
}

class Blue implements Color{
	public void fill() {
		System.out.println("Fill in Blue color");
	}
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Draw circle");
	}
}
	
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Draw rectangle");
	}
}

class Square implements Shape{
	public void draw() {
		System.out.println("Draw square");
	}
}


abstract class AbstractFactory{
	public abstract Color getColor(String type);
	public abstract Shape getShape(String type);
}

class FactoryProducer{
	public static AbstractFactory getFactory(String choise) {
		if(choise.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		else if(choise.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		}
		else {
			return null;
		}
	}
}

class ColorFactory extends AbstractFactory{
	public Color getColor(String type) {
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
	
	public Shape getShape(String type) {
		return null;
	}
}

class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType) {
		if(shapeType.equals("circle")) {
			return new Circle();
		}
		else if(shapeType.equals("rectangle")) {
			return new Rectangle();
		}
		else {
			return new Square();
		}
		
	}
	public Color getColor(String type) {
		return null;
	}
}




public class Demo {
	public static void main(String []args) {
		
		AbstractFactory shapeFactory =  new FactoryProducer().getFactory("shape");
		Shape shape = new ShapeFactory().getShape("circle");
		shape.draw();
		
		FactoryProducer.getFactory("shape").getShape("circle").draw();
		FactoryProducer.getFactory("shape").getShape("rectangle").draw();
		FactoryProducer.getFactory("shape").getShape("square").draw();
		
		FactoryProducer.getFactory("color").getColor("red").fill();
		FactoryProducer.getFactory("color").getColor("green").fill();
		FactoryProducer.getFactory("color").getColor("blue").fill();

		
	}
		
  }





