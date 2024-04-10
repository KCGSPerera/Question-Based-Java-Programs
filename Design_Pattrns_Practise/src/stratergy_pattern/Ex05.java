package stratergy_pattern;

interface FlyBehaviour{
	void fly();
}

interface SpeakBehaviour{
	void speak();
}

class FlyFast implements FlyBehaviour{
	public void fly() {
		System.out.println("Fly Fast");
	}
}

class NotFly implements FlyBehaviour{
	public void fly() {
		System.out.println("Can not fly");
	}
}

class FlySlow implements FlyBehaviour{
	public void fly() {
		System.out.println("Fly slow");
	}
}

class SpeakFast implements SpeakBehaviour{
	public void speak() {
		System.out.println("Speak Fast");
	}
}

class NotSpeak implements SpeakBehaviour{
	public void speak() {
		System.out.println("Can not speak");
	}
}

class SpeakSlow implements SpeakBehaviour{
	public void speak() {
		System.out.println("Speak slow");
	}
}

class Bird{
	FlyBehaviour flyBehaviour;
	SpeakBehaviour speakBehaviour;
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setSpeakBehaviour(SpeakBehaviour speakBehaviour) {
		this.speakBehaviour = speakBehaviour;
	}
	
	public void performFly() {
		this.flyBehaviour.fly();
	}
	
	public void performSpeak() {
		this.speakBehaviour.speak();
	}
}
public class Ex05 {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		
		FlyBehaviour flyBehaviour = new FlyFast();  // one method of doing
		bird.setFlyBehaviour(flyBehaviour);
		bird.performFly();
		
		bird.setFlyBehaviour(new NotFly());  // another method of doing
		bird.performFly();
		
		bird.setFlyBehaviour(new FlySlow());
		bird.performFly();
		
		bird.setSpeakBehaviour(new SpeakFast());
		bird.performSpeak();
		
		bird.setSpeakBehaviour(new NotSpeak());
		bird.performSpeak();
		
		bird.setSpeakBehaviour(new SpeakSlow());
		bird.performSpeak();
		
	}
}
