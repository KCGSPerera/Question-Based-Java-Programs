package regular_2022_B_01;

class Mango extends Plant{

	public void setPoints() {
		super.setPoints(20, "Mango");
	}
	public int getPoints() {
		return this.points;
	}
	public void watering() {
		System.out.println("watering in Mango");

	}
	public void clean() {
		System.out.println("Cleaning in Mango");

	}
	public void pick() {
		System.out.println("Picking in Mango");

	}
	public void GetTotalPoints() {
		
		int p = super.getPoints();
		System.out.println("Total Points : " + p);
	}

}
