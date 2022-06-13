package InteritanceAssignment;

import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Four-Wheeler");
		System.out.println("2. Two-Wheeler");
		System.out.println("Enter Vehicle Type:");
		int type = scan.nextInt();
		System.out.println("Vehicle Make:");
		String vehicleMake = scan.next();
		System.out.println("Vehicle Number:");
		String vehicleNumber = scan.next();
		System.out.println("Fuel Type:");
		System.out.println("1. Petrol");
		System.out.println("2. Diesel");
		int num = scan.nextInt();
		String fuelType = null;
		if(num==1) {
			fuelType = "Petrol";
		}else if(num==2) {
			fuelType = "Diesel";
		}else {
			System.err.println("wrong input!!");
		}
		System.out.println("Fuel capacity:");
		int fuelCapacity = scan.nextInt();
		System.out.println("Engine CC:");
		int cc = scan.nextInt();
		if(type==1) {
			System.out.println("Audio System:");
			String audioSystem = scan.next();
			System.out.println("Number of Doors:");
			int noOfDoors = scan.nextInt();
			FourWheeler fourWheeler = new FourWheeler(vehicleMake,vehicleNumber,fuelType,fuelCapacity,cc);
			fourWheeler.setAudioSystem(audioSystem);
			fourWheeler.setNumberOfDoors(noOfDoors);
			Vehicle vehicle = fourWheeler;
			vehicle.displayMake();
			vehicle.displayBasicInfo();
			vehicle.displayDetailedInfo();
			
		}else if(type==2) {
			System.out.println("Kick start available(yes/no)");
			String kickStart = scan.next();
			TwoWheeler twoWheeler = new TwoWheeler(vehicleMake,vehicleNumber,fuelType,fuelCapacity,cc);
			twoWheeler.setKickStartAvailable(kickStart);
			Vehicle vehicle = twoWheeler;
			vehicle.displayMake();
			vehicle.displayBasicInfo();
			vehicle.displayDetailedInfo();
		}else {
			System.err.println("Wrong input!!!");
		}
		scan.close();
	}

}
