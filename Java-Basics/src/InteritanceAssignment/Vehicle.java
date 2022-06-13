package InteritanceAssignment;

public class Vehicle {
	
	protected String make;
	protected String vehicleNo;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle(String make, String vehicleNo, String fuelType, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNo = vehicleNo;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
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
		
	}

}
