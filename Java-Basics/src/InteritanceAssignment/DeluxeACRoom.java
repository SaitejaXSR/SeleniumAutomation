package InteritanceAssignment;

public class DeluxeACRoom extends DeluxeRoom {
	
	protected int ratePerSquareFeet;
	
	public DeluxeACRoom(String hotelName,int numberOfSqFeet,boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSquareFeet = 12;
	}
	
	public int getRatePerSqFeet() {
		return this.ratePerSquareFeet;
	}
	
	

}
