package SwitchStatementPrograms;

import java.util.Scanner;

public class ProfitLoss {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the cost price : ");
		double cp = scan.nextDouble();
		System.out.print("enter the selling price : ");
		double sp = scan.nextDouble();
		if(sp>cp) {
			System.out.println("you have made a profit of Rs."+(sp-cp)+"/-");
		}else if(sp<cp) {
			System.out.println("you have made a loss of Rs."+(cp-sp)+"/-");
		}else {
			System.out.println("you made no returns");
		}scan.close();
	}

}
