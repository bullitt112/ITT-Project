package com.questionTwo;

import java.util.Scanner;

public class Ptwoexchangerate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RBM and 1 vice versa: ");
		int conversionType = input.nextInt();
		
		if (conversionType == 0){
			System.out.println("enter the dollar amount: ");
			double dollars = input.nextDouble();
			double RMB = dollars * rate;
			System.out.println("$" + dollars + " is " + RMB + " Yuan");
			
		}
		else if (conversionType == 1) {
			System.out.println("Enter the RMB amount: ");
			double RMB = input.nextDouble();
			double dollars = RMB / rate;
			System.out.println(RMB + " Yuan" + " is "+ "$" + dollars);
		}
		else {
			System.out.println("incorrect input!!!");
		}

	}

}
