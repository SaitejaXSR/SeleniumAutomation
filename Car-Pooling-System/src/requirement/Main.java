package requirement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public Member createMember() throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("id:");
		long id = scan.nextLong();
		System.out.println("first name:");
		String firstName = scan.next();
		System.out.println("last name:");
		String lastName = scan.next();
		System.out.println("email:");
		String email = scan.next();
		System.out.println("Contact Number:");
		String contactNumber = scan.next();
		System.out.println("licence number: ");
		String licenseNumber = scan.next();
		System.out.println("license start date:");
		Date startDate = new SimpleDateFormat("dd-mm-yyy").parse(scan.next());
		System.out.println("license expiry date:");
		Date expiryDate = new SimpleDateFormat("dd-mm-yyyy").parse(scan.next());

		return new Member(id, firstName, lastName, email, contactNumber, licenseNumber, startDate, expiryDate);
		
	}
	public static void main(String[] args) throws ParseException {
		Main main = new Main();
		Member member = new Member();
		Member m1 = main.createMember();
		Member m2 = main.createMember();
		if(member.sameEmail(m1.getEmail(), m2.getEmail())==true && member.sameNumber(m1.getContactNumber(), m2.getContactNumber())==true) {
			System.out.println("member1 and member2 are same");
		}else {
			System.out.println("member1 and member2 are different");
		}
	}
	

}
