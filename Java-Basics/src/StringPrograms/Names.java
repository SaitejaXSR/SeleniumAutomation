package StringPrograms;

import java.util.Scanner;

public class Names {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter first name : ");
		String firstName = scan.next();
		System.out.print("enter last name : ");
		String lastName = scan.next();
		String fName = firstName.substring(0,1).toUpperCase() + firstName.substring(1)	;
		String lName = lastName.toUpperCase();
 		System.out.println(fName+" "+lName);
 		scan.close();
		
	}

}
