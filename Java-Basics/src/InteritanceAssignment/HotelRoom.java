package InteritanceAssignment;

public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTv;
	protected boolean hasWifi;
	
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTv = hasTv;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int sqFeet, int costPerSqFeet) {
		int tariff = sqFeet*costPerSqFeet;
		return tariff;
		
	}
	public int getRatePerSqFeet() {
		return 0;
	}

}
