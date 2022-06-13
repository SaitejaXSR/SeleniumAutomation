package InteritanceAssignment;

public class TwoWheeler extends Vehicle{
	
	private boolean kickStartAvailable;

	public TwoWheeler(String make, String vehicleNo, String fuelType, int fuelCapacity, int cc) {
		super(make,vehicleNo,fuelType,fuelCapacity,cc);
	}
	public void setKickStartAvailable(String kickStart) {
		if(kickStart.equalsIgnoreCase("yes")) {
			this.kickStartAvailable = true;
		}else if(kickStart.equalsIgnoreCase("no")) {
			this.kickStartAvailable = false;
		}
	}
	public void getKickStartAvailable() {
		if(this.kickStartAvailable==true) {
			System.out.println("Kick start available : yes");
		}else if(this.kickStartAvailable==false) {
			System.out.println("Kick start available : no");
		}
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
		getKickStartAvailable();
	} 

}
