package InteritanceAssignment;

public class SuiteACRoom extends HotelRoom{
	
	private int ratePerSquareFeet;
	
	public SuiteACRoom(String hotelName,int numberOfSqFeet,boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSquareFeet = 15;
	}
	public int getRatePerSqFeet() {
		if (hasWifi==true) {
			return (this.ratePerSquareFeet+2);
		}else {
			return this.ratePerSquareFeet;
		}
	}

}
