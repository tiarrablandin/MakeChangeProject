package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double price = 0.00;
		double cash = 0.00;
		double dollars = 0.00;
		
		
		System.out.println("Price: ");
		price  = sc.nextDouble();
		
		System.out.println("Cash: ");
		cash  = sc.nextDouble();
		
		if (cash < price) {
			System.out.println("Not enough cash. Goodbye.");
		}
		
		else if (cash > price) {
			dollars = cash - price;
			dollars *= 100;
			System.out.println("\nChange: \n");
				if ((int)dollars / 2000 > 0) {
					System.out.println("20's: " + ((int)dollars / 2000));
					dollars %= 2000; 
				}
				
				if ((int)dollars / 1000 > 0) {
					System.out.println("10's: " + (int)dollars / 1000);
					dollars %= 1000; 
				}
				
				if ((int)dollars / 500 > 0) {
					System.out.println("5's: " + (int)dollars / 500);
					dollars %= 500; 
				}
				
				if ((int)dollars / 100 > 0) {
					System.out.println("1's: " + (int)dollars / 100);
					dollars %= 100; 
				}
				
				if ((int)dollars / 25 > 0) {
					System.out.println("Quarters: " + (int)dollars / 25);
					dollars %= 25; 
				}
				
				if ((int)dollars / 10 > 0) {
					System.out.println("Dimes: " + (int)dollars / 10);
					dollars %= 10; 
				}
				
				if ((int)dollars / 5 > 0) {
					System.out.println("Nickels: " + (int)dollars / 5);
					dollars %= 5; 
				}
				
				if ((int)dollars / 1 > 0) {
					System.out.println("Pennies: " + (int)dollars / 1);
					dollars %= 1; 
				}
				
			System.out.println("\nThank you. Goodbye.");
			
		}
		
		else if (cash == price) {
			System.out.println("Thank you. Goodbye.");
		}
		
		sc.close();
		
	}

}
