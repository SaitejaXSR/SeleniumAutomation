package StringPrograms;

import java.util.Scanner;

public class ClaraCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value on calculator");
		String value = scan.next();
		int count = 0;
		for(int i = 0; i<value.length(); i++) {
			for(int j = i+1; j<=value.length(); j++) {
				String s = value.substring(i, j);
				if(s.length()==3) {
					int num = Integer.parseInt(s);
					if(num%4==0) {
						count++;
					}
				}
			}
			
		}
		System.out.println("Number of 3 digit numbers divisible by 4 : "+count);
		scan.close();
		
	}

}
