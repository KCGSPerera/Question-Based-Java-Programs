package bridge_pattern;

interface Tv{
	void on();
	void off();
	void tune();
}

interface Remote{
	void on();
	void off();
	void tune();
}

//class LG TV Implementation
class LG implements Tv{
	
	public void on() {
		System.out.println("On LG Tv");
	}
	
	public void off() {
		System.out.println("Off LG Tv");
	}
	
	public void tune() {
		System.out.println("Tune LG Tv");
	}
}

// class SONY TV Implementation
class Sony implements Tv{
	
	public void on() {
		System.out.println("On Sony Tv");
	}
	
	public void off() {
		System.out.println("Off Sony Tv");
	}
	
	public void tune() {
		System.out.println("Tune Sony Tv");
	}
}

// class Remote Implementation
class RemoteImpl implements Remote{
	
	Tv tv;
	
	public RemoteImpl(Tv tv) {
		this.tv = tv;
	}
	
	public void on() {
		tv.on();
	}
	
	public void off() {
		tv.off();
	}
	
	public void tune() {
		tv.tune();
	}
}


public class Ex08 {

	public static void main(String[] args) {

		Tv lgTv = new LG();
		Tv sonyTv = new Sony();
		
		new RemoteImpl(lgTv).on();
		new RemoteImpl(lgTv).off();
		new RemoteImpl(lgTv).tune();
		
		System.out.println();
		
		new  RemoteImpl(sonyTv).on();
		new  RemoteImpl(sonyTv).off();
		new  RemoteImpl(sonyTv).tune();


	}

}
