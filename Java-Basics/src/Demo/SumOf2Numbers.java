package Demo;

import java.util.Scanner;

public class SumOf2Numbers {
	public static void main(String[] args) {
		Numbers num = new Numbers();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number");
		num.num1 = scan.nextInt();
		System.out.println("enter 2nd number");
		num.num2 = scan.nextInt();
		num.sum();
		scan.close();
		
	}

}
