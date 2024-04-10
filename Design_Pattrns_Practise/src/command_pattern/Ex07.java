package command_pattern;

interface Light{
	void on();
	void off();
}

interface Command{
	void execute();
}

class BedRoomLight implements Light{
	
	public void on() {
		System.out.println("Bed room light on");
	}
	
	public void off() {
		System.out.println("Bed room light off");
	}
}

class LivingRoomLight implements Light{
	
	public void on() {
		System.out.println("Living room light on");
	}
	
	public void off() {
		System.out.println("Living room light off");
	}
}

class OnCommand implements Command{
	
	Light light;
	
	public  OnCommand(Light light) {
		this.light = light;	}
	
	public void execute() {
		this.light.on();
	}
}

class OffCommand implements Command{
	
	Light light;
	
	public OffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		this.light.off();
	}
}

class RemoteController {
	
	Command onCommand;
	Command offCommand;
	
	public void setCommand(Command onCommand, Command offCommand) {
		this.onCommand =  onCommand;
		this.offCommand = offCommand;
	}
	
	public void onButtonPushed() {
		this.onCommand.execute();
	}
	
	public void offButtonPushed() {
		this.offCommand.execute();
	}
	
}

public class Ex07 {

	public static void main(String[] args) {
		
		RemoteController remoteController = new RemoteController();
		Light bedRoomLight = new BedRoomLight();
		Light livingRoomLight =  new LivingRoomLight();
		
		Command onCommandLivingRoomLight = new OnCommand(livingRoomLight);
		Command offCommandLivingRoomLight =  new OffCommand(livingRoomLight);
		Command onCommandBedRoomLight = new OnCommand(bedRoomLight);
		Command offCommandBedRoomLight =  new OffCommand(bedRoomLight);
		
		remoteController.setCommand(onCommandBedRoomLight, offCommandBedRoomLight);
		remoteController.onButtonPushed();
		remoteController.offButtonPushed();
		
		remoteController.setCommand(onCommandLivingRoomLight, offCommandLivingRoomLight);
		remoteController.onButtonPushed();
		remoteController.offButtonPushed();

		
	}

}
