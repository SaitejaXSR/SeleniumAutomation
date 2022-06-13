package InteritanceAssignment;

public class DeluxeRoom extends HotelRoom {
	
	protected int ratePerSquareFeet;
	
	public DeluxeRoom(String hotelName,int numberOfSqFeet,boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSquareFeet = 10;
	}
	
	public int getRatePerSqFeet() {
		if (hasWifi==true) {
			return (this.ratePerSquareFeet+2);
		}else {
			return this.ratePerSquareFeet;
		}
	}

}
