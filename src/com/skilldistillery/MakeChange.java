package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double priceOfItem;
		double amountTendered;
		System.out.print("Enter the price of the item: ");
		priceOfItem = input.nextDouble();
		System.out.print("Enter amount tendered:");
		amountTendered = input.nextDouble();
		if (priceOfItem > amountTendered) {
			System.out.println("Error: Price of item exceeds amount tendered");
		} else {
			makeChange(priceOfItem, amountTendered);
		}
	}

//		takes double and casts to int
//		multiplication to remove inconsistent decimal calculation of double data type
	public static int getOwed(double priceOfItem, double amountTendered) {
		int change = (int) ((amountTendered * 100) - (priceOfItem * 100));
		return change;
	}

//		returns change as amount of bills to give to customer
	public static void makeChange(double priceOfItem, double amountTendered) {

//			getOwed method called to cast (double->int), get difference, and return a value
		int change = getOwed(priceOfItem, amountTendered);

//			Change converted back to double before calculations to show user flat monetary value to be given back after transaction
		double changeMessage = ((double) change) / 100;

		System.out.println("We owe you: ");
		System.out.println("$" + changeMessage);

		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

//			tests in place to test/locate infinite loops AND see why infinite loop is occurring
//			using while loops to increment amount of bills
		while (change != 0) {
			while (change >= 20_00) {
				change -= 2000;
				twenties++;
//					System.out.println("test1");
//					System.out.println(change);			
			}
			while (change >= 10_00) {
				change -= 1000;
				tens++;
//					System.out.println("test2");
//					System.out.println(change);			
			}
			while (change >= 5_00) {
				change -= 500;
				fives++;
//					System.out.println("test3");
//					System.out.println(change);			
			}
			while (change >= 1_00) {
				change -= 100;
				ones++;
//					System.out.println("test4");
//					System.out.println(change);			
			}
			while (change >= 25) {
				change -= 25;
				quarters++;
//					System.out.println("test5");
//					System.out.println(change);			
			}
			while (change >= 10) {
				change -= 10;
				dimes++;
//					System.out.println("test6");
//					System.out.println(change);			
			}
			while (change >= 5) {
				change -= 5;
				nickels++;
//					System.out.println("test7");
//					System.out.println(change);			
			}
			while (change >= 1) {
				change -= 1;
				pennies++;
//					System.out.println("test8");
//					System.out.println(change);
			}
		}

//			print if bills/coins are to be given
		if (twenties > 0) {
			System.out.println(twenties + " twenty(s)");
		}
		if (tens > 0) {
			System.out.println(tens + " ten(s)");
		}
		if (fives > 0) {
			System.out.println(fives + " five(s)");
		}
		if (ones > 0) {
			System.out.println(ones + " one(s)");
		}
		if (quarters > 0) {
			System.out.println(quarters + " quarter(s)");
		}
		if (dimes > 0) {
			System.out.println(dimes + " dime(s)");
		}
		if (nickels > 0) {
			System.out.println(nickels + " nickel(s)");
		}
		if (pennies > 0) {
			System.out.println(pennies + " penny(s)");
		}
	}

}
