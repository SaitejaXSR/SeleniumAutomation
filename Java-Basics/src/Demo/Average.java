package Demo;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Marks marks = new Marks();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter sub1 marks");
		marks.sub1=scan.nextDouble();
		System.out.println("enter sub2marks");
		marks.sub2=scan.nextDouble();
		System.out.println("enter sub3 marks");
		marks.sub3=scan.nextDouble();
		marks.average();
		scan.close();
	}

}
