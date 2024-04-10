package regular_2022_B_01;

class Orchid extends Plant{

	String command;
	
	public Orchid(String command) {
		super();
		this.command = command;
	}
	public void setPoints() {
		super.setPoints(10, "Orchid");
	}
	public int getPoints() {
		return this.points;
	}
	public void watering() {
		System.out.println("watering in Orchid");
	}
	public void clean() {
		System.out.println("Cleaning in Orchid");

	}
	public void pick() {
		System.out.println("Picking in Orchid");

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
				throw new AbsorbException("Absorb Nitrogen");
			}catch(AbsorbException e){
				e.printStackTrace();
			}
			return true;
			
		}
		else {
			System.out.println("Does not absorb nitrogen");
			return false;
		}
		
	}
	
}
