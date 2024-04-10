package Version_B_Interfaces;

import java.util.Random;

// Alean interface
interface Alean{
	
	public int getScore();
}


// class MarshMalloAlean
class MarshmalloAlean implements Alean{
	
	private int score;
	
	// default constructor
	public MarshmalloAlean() {
		this.score = 15;
	}
	
	// override
	public  int getScore() {
		return this.score;
	}
}





// class OrgeAlean
class OrgeAlean implements Alean{
	
	private int score;
	
	// default constructor
	public OrgeAlean() {
		this.score = 10;
	}
	
	// override
	public int getScore() {
		return this.score;
	}
	
}





// class SnakeAlean
class SnakeAlean implements Alean{
	
	private int score;
	
	// default constructor
	public SnakeAlean() {
		this.score = 5;
	}
	
	// override
	public int getScore() {
		return this.score;
	}
	
}




// class AleanPack
class AleanPack {
	
	// array
	Alean[] arr;
	
	// constructor
	public AleanPack(int noOfAleans) {
		
		arr = new Alean[noOfAleans];
	}
;	
	
	
	// addAlean Method
	void addAlean(Alean a, int index) {
		arr[index] = a;
	}
	
	// getAlean
	public Alean[] getAlean() {
		
		return arr;
		
	}
}




// class MenInBlack
class MenInBlack{
	
	AleanPack ap;
	int score;
	
	// constructor
	public MenInBlack(AleanPack a) {
		
		this.score = 0;
		this.ap = a;
		
	}
	
	// getAleanPack method
	public AleanPack getAleanPack() {
		
		return this.ap;
	}
	
	
	// getScore method
	public int getScore() {
		
		return this.score;
	}
	
	
	
	// kill method
	public void kill() {
		
		Alean arr[] = ap.getAlean();
		
		for(int i = 0; i < arr.length; i++ ) {
			this.score = this.score + arr[i].getScore();
		}
	}
}



// class MenInBlack2
class MenInBlack2 extends MenInBlack{
	
	public MenInBlack2(AleanPack a) {
		super(a);
		score = 0;
	}
	
	
	// kill method
	public void kill() {
		Alean arr[] =  ap.getAlean();
		
		for(int i = 0; i < arr.length; i++) {
			
			Random rand = new Random();
			
			this.score = this.score + arr[i].getScore();
			
			if(rand.nextInt() % 2 == 1) {
				this.score =this.score - 2;
			}
				
		}
		
	}
		
}





public class ClassB {
	
	// main program
	public static void main(String [] args) {
		
		
		// create object
		AleanPack pack1 =  new AleanPack(5);
		
		// call the addAlean method
		pack1.addAlean(new MarshmalloAlean(), 0);
		pack1.addAlean(new OrgeAlean(), 1);
		pack1.addAlean(new OrgeAlean(), 2);
		pack1.addAlean(new SnakeAlean(), 3);
		pack1.addAlean(new MarshmalloAlean(), 4);
		
		MenInBlack AgentK = new MenInBlack(pack1);
		AgentK.kill();
		
		System.out.println( "Your score is " + AgentK.getScore());
		
		MenInBlack2 AgentK2 = new MenInBlack2(pack1);
		AgentK2.kill();
		
		System.out.println( "Your score is " + AgentK2.getScore());

		
	}

}
