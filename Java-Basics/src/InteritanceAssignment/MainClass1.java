package InteritanceAssignment;

import java.util.Scanner;

public class MainClass1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println("");
		System.out.print("Select Room Type:");
		int room = scan.nextInt();
		System.out.print("Hotel Name: ");
		String hotelName = scan.next();
		System.out.print("Room Square Feet Area : ");
		int squareFeet = scan.nextInt();
		System.out.print("Room has TV(yes/no):");
		String tv = scan.next();
		boolean hasTv = false;
		if(tv.equalsIgnoreCase("yes")) {
			hasTv = true;
		}else if(tv.equalsIgnoreCase("no")) {
			hasTv = false;
		}else {
			System.out.println("wrong input");
		}
		System.out.print("Room has Wifi(yes/no):");
		String wifi = scan.next();
		boolean hasWifi = false;
		if(wifi.equalsIgnoreCase("yes")) {
			hasWifi = true;
		}else if(wifi.equalsIgnoreCase("no")) {
			hasWifi = false;
		}else {
			System.out.println("wrong input");
		}
		
		if(room==1) {
			HotelRoom hotelRoom = new DeluxeRoom(hotelName, squareFeet, hasTv, hasWifi);
			int roomTariff = hotelRoom.calculateTariff(squareFeet, hotelRoom.getRatePerSqFeet());
			System.out.println("Room tariff per day : "+roomTariff);
		}else if(room==2) {
			HotelRoom hotelRoom = new DeluxeACRoom(hotelName, squareFeet, hasTv, hasWifi);
			int roomTariff = hotelRoom.calculateTariff(squareFeet, hotelRoom.getRatePerSqFeet());
			System.out.println("Room tariff per day : "+roomTariff);
		}else if(room==3) {
			HotelRoom hotelRoom = new SuiteACRoom(hotelName, squareFeet, hasTv, hasWifi);
			int roomTariff = hotelRoom.calculateTariff(squareFeet, hotelRoom.getRatePerSqFeet());
			System.out.println("Room tariff per day : "+roomTariff);
		}else {
			System.err.println("Wrong input");
		}
		scan.close();
	}

}
