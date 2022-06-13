package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int length = scan.nextInt();
		int[] num = new int[length];
		System.out.println("enter the "+length+" values in array");
		for(int i = 0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		System.out.println("the second largest number in the array is "+num[num.length-2]);
		scan.close();
	}

}
