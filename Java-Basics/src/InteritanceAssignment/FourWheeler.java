package InteritanceAssignment;

public class FourWheeler extends Vehicle {
	
	private String audioSystem;
	private int numberOfDoors;
	
	public FourWheeler(String make, String vehicleNo, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNo, fuelType, fuelCapacity, cc);
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
		
	}
	public void getAudioSystem() {
		System.out.println("Audio system : "+this.audioSystem);
	}
	public void setNumberOfDoors(int noOfDoors) {
		this.numberOfDoors = noOfDoors;
	}
	public void getNumberOfDoors() {
		System.out.println("Number of Doors: "+this.numberOfDoors);
	}
	public void displayMake() {
		System.out.println("make of vehicle : "+this.make);
	}
	public void displayBasicInfo() {
		System.out.println("Basic Information:");
		System.out.println("Vehicle no: "+this.vehicleNo);
		System.out.println("Fuel Type: "+this.fuelType);
		System.out.println("Fuel capacity: "+this.fuelCapacity);
		System.out.println("CC: "+this.cc);
	}
	public void displayDetailedInfo(){
		getAudioSystem();
		getNumberOfDoors();
	}

}
