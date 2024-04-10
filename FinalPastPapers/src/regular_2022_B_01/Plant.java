package regular_2022_B_01;



public abstract class Plant implements PointerCollector{
	int points;
	String type;
	
	public void setPoints(int points, String type) {
		this.points = points;
		this.type = type;
	}
	public int getPoints() {
		return this.points;
	}
	
	public abstract void watering();
	public abstract void clean();
	public abstract void pick();
	public abstract void GetTotalPoints();
}
