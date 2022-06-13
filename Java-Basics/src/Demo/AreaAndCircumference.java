package Demo;

import java.util.Scanner;

public class AreaAndCircumference {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		circle.radius=scan.nextDouble();
		circle.area();
		circle.circumference();
		scan.close();
		
	}
	

}
