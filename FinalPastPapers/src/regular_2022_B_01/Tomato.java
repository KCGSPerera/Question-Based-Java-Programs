package regular_2022_B_01;

public class Tomato extends Plant{
	String command;
	
	
	public Tomato(String command) {
		super();
		this.command = command;
	}
	public void setPoints() {
		super.setPoints(30, "Tomato");
	}
	public int getPoints() {
		return this.points;
	}
	public void watering() {
		System.out.println("watering in Tomato");

	}
	public void clean() {
		System.out.println("Cleaning in Tomato");

	}
	public void pick() {
		System.out.println("Picking in Tomato");

	}
	public void GetTotalPoints() {
		if((this.command == "absorbN") || (this.command == "absorbwater")) {
			super.setPoints(0, "Tomato");
		}
		int p = getPoints();
		System.out.println("Total Points : " + p);
	}
	public boolean isAbsorb(String command) {
		this.command = command;
		
		if(this.command == "absorbwater") {
			try {
				throw new AbsorbException("Absorb Water");
			}catch(AbsorbException e){
				e.printStackTrace();
			}
			return true;
			
		}
		else {
			System.out.println("Does not absorb water");
			return false;
		}
	}
	
}

