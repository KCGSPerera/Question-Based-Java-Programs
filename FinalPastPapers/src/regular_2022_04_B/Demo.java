package regular_2022_04_B;

interface Car{
	
	public void assembleLight();
	public void assembleMonitorSensor();
}

class ToyotaCar implements Car{
	
	CarAirBag airBag;
	
	public ToyotaCar(CarAirBag airBag) {
		super();
		this.airBag = airBag;
	}

	public void assembleLight() {
		System.out.println("Assembling for Toyota");
		airBag.airBagLightDetection();
	}
	
	public void assembleMonitorSensor() {
		System.out.println("Assembling for Toyota");
		airBag.airBagMotionDetection();
	}
}

class NissanCar implements Car{
	
	CarAirBag airBag;
		
	public NissanCar(CarAirBag airBag) {
		super();
		this.airBag = airBag;
	}
	
	public void assembleLight() {
		System.out.println("Assembling for Nissan");
		airBag.airBagLightDetection();
	}

	public void assembleMonitorSensor() {
		System.out.println("Assembling for Nissan");
		airBag.airBagMotionDetection();
	}
}



interface CarAirBag{
	
	public void airBagMotionDetection();
	public void airBagLightDetection();
}



class FrontAirBag implements CarAirBag{
	
	public void airBagMotionDetection() {
		System.out.println("Motion detection on for front air bag");	
	}
	
	public void airBagLightDetection() {
		System.out.println("Light indicator on for front air bag");	
	}
}



class SideAirBag implements CarAirBag{

	public void airBagMotionDetection() {
		System.out.println("Motion detection on for side air bag");	
	}
	
	public void airBagLightDetection() {
		System.out.println("Light indicator on for side air bag");		
	}
}



public class Demo {

	public static void main(String[] args) {
		
		CarAirBag fAirBag = new FrontAirBag();
		CarAirBag sAirBag = new SideAirBag();
		
		new NissanCar(fAirBag).assembleLight();
		new NissanCar(fAirBag).assembleMonitorSensor();
		new NissanCar(sAirBag).assembleLight();
		new NissanCar(sAirBag).assembleMonitorSensor();
		
		new ToyotaCar(fAirBag).assembleLight();
		new ToyotaCar(fAirBag).assembleMonitorSensor();
		new ToyotaCar(sAirBag).assembleLight();
		new ToyotaCar(sAirBag).assembleMonitorSensor();
	}

}
