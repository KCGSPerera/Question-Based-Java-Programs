package regular_2022_B_01;

// Completed but, no correct output is given.

public class Demo {

	public static void main(String[] args) {
		
		Plant orchid1 = new Orchid("absorbN");
		orchid1.pick();
		orchid1.watering();
		orchid1.GetTotalPoints();
		
		Plant orchid2 = new Orchid("absorb");
		orchid2.pick();
		orchid2.watering();
		orchid2.GetTotalPoints();
		
		Plant mango1 = new Mango();
		mango1.clean();
		mango1.pick();
		mango1.watering();
		mango1.GetTotalPoints();
		
		Plant tomato1 = new Tomato("absorbwater");
		tomato1.watering();
		tomato1.GetTotalPoints();
	}

}
