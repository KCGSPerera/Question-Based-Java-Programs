package october_2019_A_01;

// not completed.

interface ISatellite{
	
	void activate();
	void deactivate();
}

interface IGeoLocation{
	
	void displayLocation();
}



class DroneSatellite implements ISatellite{
	String name;	
	
	public DroneSatellite(String name) {
		super();
		this.name = name;
	}
	public void activate() {
		System.out.println("Drone Satellite");
	}
	public void deactivate() {
		
	}
}



class NavigationSatellite implements ISatellite{
	String name;
		
	public NavigationSatellite(String name) {
		super();
		this.name = name;
	}
	public void activate() {
		
	}	
	public void deactivate() {
		
	}
}


class SatelliteLocation implements IGeoLocation{
	String location;
	
	public SatelliteLocation(String location) {
		super();
		this.location = location;
	}
	public void displayLocation() {
		
	}
}


class SatelliteCenter{
	
	int option;
	ISatellite[] iSatellites;
	IGeoLocation[] iGeoLocations;
	
	public SatelliteCenter(int option, ISatellite[] iSatellites, IGeoLocation[] iGeoLocations) {
		super();
		this.option = option;
		this.iSatellites = iSatellites;
		this.iGeoLocations = iGeoLocations;
	}
	
	public void startService() {
		
		switch (option) {
		
		case 0 : new DroneSatellite("Satellite1").activate();;
				 break;
				 
		case 1 : new NavigationSatellite("Satellite2").activate();
				 break;
				 
		default : break;
		
		}
		
	}
	
	public void stopService() {
		
		switch (option) {
		
		case 0 : new DroneSatellite("Satellite1").deactivate();;
				 break;
				 
		case 1 : new NavigationSatellite("Satellite2").deactivate();
				 break;
				 
		default : break;
		
		}
	}
	
	public void locationService() {
		
		switch (option) {
		
		case 0 : new SatelliteLocation("Location1").displayLocation();
				 break;
				 
		case 1 : new SatelliteLocation("Location2").displayLocation();
				 break;
				 
		default : break;
		
		}
	}
}




public class SatelliteDemo {

	public static void main(String[] args) {
		
		ISatellite navigationSatellite = new NavigationSatellite("Ravana01");
		IGeoLocation locationTracker01 = new SatelliteLocation("Sri Lanka");
		ISatellite droneSatellite = new DroneSatellite("Ravana02");
		IGeoLocation locationTracker02 = new SatelliteLocation("Russia");
	
		ISatellite[] satelliteArray = new ISatellite[] {navigationSatellite, droneSatellite};
		IGeoLocation[] trackerArray = new IGeoLocation[]{locationTracker01, locationTracker02};
		
		SatelliteCenter satelliteCenter = new SatelliteCenter(0, satelliteArray, trackerArray);
		satelliteCenter.startService();
		satelliteCenter.stopService();
		satelliteCenter.locationService();
		
		SatelliteCenter remoteController2 = new SatelliteCenter(0, satelliteArray, trackerArray);
		remoteController2.startService();
		remoteController2.stopService();
		remoteController2.locationService();
	}

}
