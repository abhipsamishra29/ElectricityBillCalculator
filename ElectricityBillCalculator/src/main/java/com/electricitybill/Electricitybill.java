package com.electricitybill;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the the Units");
		Scanner scan = new Scanner(System.in);
		int units = scan.nextInt();
		scan.close();
	
		if(units<=50) {
			System.out.println("Your total bill is "+ units);
			
		} else if(units >50 && units<=100) {
			int extra = units-50;
			System.out.println("Your total bill is "+ (50+(extra*2)));
		} else if(units >100 && units<=200) {
			int extra = units-100;
			System.out.println("Your total bill is "+ (50+100+(extra*3)));
		} else if(units >200 && units<=400) {
			int extra = units-200;
			System.out.println("Your total bill is "+ (50+100+300+(extra*4)));
		} else {
			int extra = units-400;
			System.out.println("Your total bill is "+ (50+100+300+800+(extra*5)));
		}
		
	}
	
	
	
}
